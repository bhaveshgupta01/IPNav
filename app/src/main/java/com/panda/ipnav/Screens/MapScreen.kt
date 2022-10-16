package com.panda.ipnav.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import com.panda.ipnav.R
import com.panda.ipnav.data.Screen
import com.panda.ipnav.ui.theme.IPNavTheme

class MapScreen {
}


@Composable
fun MainScreen()
{
    val navController = rememberNavController()


    Scaffold(topBar = {
        TopAppBar() {
            IconButton(onClick = {
                navController.navigate(Screen.DetailsList.route)
            }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "List of Schools",
                    modifier= Modifier.padding(8.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "IPNav")
        }
    }) {
        NavHost(
            navController = navController,
            startDestination = Screen.MainScreen.route,
            modifier = Modifier.padding(8.dp)
        ) {
            composable(route= Screen.MainScreen.route,content = { MainScreen()})
        }

        var viewBut by remember  { mutableStateOf(0) }
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {viewBut=0}) {
                    Column() {
                        Icon(imageVector = Icons.Filled.Home,
                            contentDescription = "Schools")
                        Text(text = "Academics")
                    }
                }
                Button(onClick = {viewBut=1}) {
                    Column() {
                        Icon(imageVector = Icons.Filled.Email,
                            contentDescription = "Schools")
                        Text(text = "Eateries")
                    }
                }
                Button(onClick = {viewBut=2}) {
                    Column() {
                        Icon(imageVector = Icons.Filled.Build,
                            contentDescription = "Schools")
                        Text(text = "Facilities")
                    }
                }
            }

            Card(
                elevation = 20.dp,
                modifier = Modifier
                    .fillMaxSize()
                    //.padding(0.dp,10.dp,0.dp,0.dp),
                ,shape = RoundedCornerShape(20.dp),
                backgroundColor = Color(0xffe7d6bd)
            ) {
                if(viewBut==0){
                    Image(
                        painter = painterResource(id = R.drawable.academic),
                        contentDescription = null,
                        modifier = Modifier.padding(5.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
                else if (viewBut==1){
                    Image(
                        painter = painterResource(id = R.drawable.background),
                        contentDescription = null,
                        modifier = Modifier.padding(5.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
                else{
                    Image(
                        painter = painterResource(id = R.drawable.sport),
                        contentDescription = null,
                        modifier = Modifier.padding(5.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun DefaultPreview() {
    IPNavTheme {
        MainScreen()
    }
}
