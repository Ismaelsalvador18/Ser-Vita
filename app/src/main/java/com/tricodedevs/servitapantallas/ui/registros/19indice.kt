package com.example.servita.ui.screens
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.shadow
import androidx.compose.foundation.clickable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tricodedevs.servitapantallas.ui.registros.GreatVibes
import androidx.compose.ui.draw.clip



@Composable
fun MainAppServita() {
    var currentScreen by remember { mutableStateOf("metricas") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                contentColor = TextColor
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, "Perfil") },
                    label = { Text("Perfil", fontSize = 12.sp) },
                    selected = currentScreen == "perfil",
                    onClick = { currentScreen = "perfil" }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.List, "Hábitos") },
                    label = { Text("Hábitos", fontSize = 12.sp) },
                    selected = currentScreen == "habitos",
                    onClick = { currentScreen = "habitos" }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Bookmark, "Registros") },
                    label = { Text("Registros", fontSize = 12.sp) },
                    selected = currentScreen == "registros",
                    onClick = { currentScreen = "registros" }
                )
            }
        }
    ) { innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding)) {
            when (currentScreen) {
                "perfil" -> PerfilScreenServita()
                "habitos" -> HabitosScreenServita()
                "registros" -> RegistrosScreenServita()
                else -> MetricasScreenServita()
            }
        }
    }
}

@Composable
fun MetricasScreenServita() {
    var altura by remember { mutableStateOf("160") }
    var peso by remember { mutableStateOf(60f) }
    var genero by remember { mutableStateOf("Mujer") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(YellowSoft),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Menú",
                    tint = Color.Black,
                    modifier = Modifier.size(40.dp)
                )

                Text(
                    text = "Ser+ Vita",
                    color = GreenAccent,
                    fontSize = 50.sp,
                    fontFamily = GreatVibes,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f)
                )

                Spacer(modifier = Modifier.size(30.dp))
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Métricas Fisiológicas",
            color = TextColor,
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .width(328.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .shadow(6.dp, RoundedCornerShape(10.dp))
                        .background(YellowSoft, RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "\u2642",
                            fontSize = 70.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "Hombre",
                            color = TextColor,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                        .background(Color.White, RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "\u2640",
                            fontSize = 70.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "Mujer",
                            color = TextColor,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        val pesoColor = Color(0xFFF2E1A1)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .border(2.dp, YellowBorder, RoundedCornerShape(12.dp))
                .background(Color(0xFFFEF7DD), RoundedCornerShape(12.dp))
                .padding(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "PESO:",
                    color = TextColor,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Slider(
                        value = peso,
                        onValueChange = { peso = it },
                        valueRange = 30f..150f,
                        steps = 12,
                        modifier = Modifier.weight(1f),
                        colors = SliderDefaults.colors(
                            thumbColor = pesoColor,
                            activeTrackColor = pesoColor,
                            inactiveTrackColor = Color.LightGray
                        )
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "${peso.toInt()} Kg",
                        fontSize = 14.sp,
                        color = TextColor,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .border(2.dp, YellowBorder, RoundedCornerShape(12.dp))
                .background(Color(0xFFFEF7DD), RoundedCornerShape(12.dp))
                .padding(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "ALTURA:",
                    color = TextColor,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Slider(
                        value = peso,
                        onValueChange = { peso = it },
                        valueRange = 30f..150f,
                        steps = 12,
                        modifier = Modifier.weight(1f),
                        colors = SliderDefaults.colors(
                            thumbColor = pesoColor,
                            activeTrackColor = pesoColor,
                            inactiveTrackColor = Color.LightGray
                        )
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "${peso.toInt()} cm",
                        fontSize = 14.sp,
                        color = TextColor,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        val hombreBackground = Color(0xFFF2E1A1)

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
                .padding(horizontal = 50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = hombreBackground)
        ) {
            Text(
                text = "Calcular IMC",
                fontSize = 22.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun PerfilScreenServita() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(YellowSoft),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Vita",
                    color = GreenAccent,
                    fontSize = 56.sp,
                    fontFamily = GreatVibes,
                    textAlign = TextAlign.Center
                )
            }
            Text(
                text = "Pantalla de Perfil",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
        }
    }
}

@Composable
fun HabitosScreenServita() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(YellowSoft),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Vita",
                    color = GreenAccent,
                    fontSize = 56.sp,
                    fontFamily = GreatVibes,
                    textAlign = TextAlign.Center
                )
            }
            Text(
                text = "Pantalla de Hábitos",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
        }
    }
}

@Composable
fun RegistrosScreenServita() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(YellowSoft),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Vita",
                    color = GreenAccent,
                    fontSize = 56.sp,
                    fontFamily = GreatVibes,
                    textAlign = TextAlign.Center
                )
            }
            Text(
                text = "Pantalla de Registros",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainAppServitaPreview() {
    MainAppServita()
}
