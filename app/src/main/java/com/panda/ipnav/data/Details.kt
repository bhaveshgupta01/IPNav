package com.panda.ipnav.data

data class Details(
    val Name: String,
    val Depts: List<String>,
)

val Blocks= listOf(
    Details("A Block", listOf("University School of Bio Technology","University School of Environment Management")),
    Details("B Block", listOf("University School of Chemical Technology","University School of Basic & Applied Sciences")),
    Details("C Block", listOf("University School of Law and Legal Studies","University School of Humanities & Social Sciences")),
    Details("D Block", listOf("University School of Management Studies")),
    Details("E Block", listOf("University School of Information, Communication and Technology","University Centre for Disaster Management Studies")),
    Details("Library", listOf("University Information Resource Centre")),
)

val Admin= listOf(
    Details("Administration Block", listOf()),
    Details("Admission Block", listOf()),
    Details("Examination Block", listOf()),
    Details("Directorate of Student Welfare", listOf()),
)

val Resi= listOf(
    Details("Boys Hostel", listOf()),
    Details("Girls Hostel", listOf()),
    Details("Faculty Quarters", listOf("Type I, II, III", "Type IV, V")),
)
val Facilities= listOf(
    Details("Cafeteria", listOf()),
    Details("Amul Frenchise", listOf()),
    Details("Nescafe Frenchesie", listOf()),
    Details("Bank", listOf("Indian Bank")),
    Details("Basic Supplies Shop", listOf()),
)

val SemiHall= listOf(
    Details("Seminar Hall, C-Block", listOf()),
    Details("Seminar Hall, D-Block", listOf()),
    Details("Seminar Hall, E-Block", listOf()),
)
val Sports= listOf(
    Details("Main Ground", listOf()),
    Details("Badminton Court", listOf()),
    Details("Tennis Court", listOf()),
    Details("Squash Court", listOf()),
    Details("Basketball Court", listOf()),
    Details("Volleyball Court", listOf()),
    Details("Football Ground", listOf()),
    Details("Kids Play Area", listOf()),
    Details("Swimming Pool", listOf()),
)




