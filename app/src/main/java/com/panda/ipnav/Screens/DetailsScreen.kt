package com.panda.ipnav.Screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.panda.ipnav.ui.theme.IPNavTheme
import androidx.compose.ui.Modifier
import com.panda.ipnav.data.*

class DetailsScreen {
}

@Composable
fun DetailsList()
{
    Scaffold(topBar = {
        TopAppBar() {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back to previous screen"
            )
        }
    })
    {
        Column(Modifier.verticalScroll(rememberScrollState()).padding(4.dp)) {
            Text(text = "Academic Blocks")
            LazyRow() {
                items(Blocks) {
                    SchoolCard(detail = it)
                }
            }
            Text(text = "Administrative Blocks")
            LazyRow() {
                items(Admin) {
                    SchoolCard(detail = it)
                }
            }
            Text(text = "Residential Areas")
            LazyRow() {
                items(Resi) {
                    SchoolCard(detail = it)
                }
            }
            Text(text = "Facilities")
            LazyRow() {
                items(Facilities) {
                    SchoolCard(detail = it)
                }
            }
            Text(text = "Halls")
            LazyRow() {
                items(SemiHall) {
                    SchoolCard(detail = it)
                }
            }
            Text(text = "Sports and Grounds")
            LazyRow() {
                items(Sports) {
                    SchoolCard(detail = it)
                }
            }
        }

    }
}
@Composable
fun SchoolCard(detail:Details)
{
    var expanded by remember  { mutableStateOf(false) }
    Card(
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Column {
                    Text(
                        text = detail.Name,
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
                Spacer(Modifier.weight(1f))
                IconButton(onClick = {expanded=!expanded }) {
                    Icon(
                        imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                        tint = MaterialTheme.colors.secondary,
                        contentDescription = null,
                    )
                }
            }
            if (expanded) {
                LazyColumn(modifier=Modifier){
                    items(detail.Depts) {
                        Text(text = it)
                    }
                }
            }
        }
    }
}




@Preview(showBackground = true,showSystemUi = true)
@Composable
fun ListPreview() {
    IPNavTheme {
        DetailsList()
    }
}