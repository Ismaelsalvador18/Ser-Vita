package com.example.servita.ui.screens
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.shadow
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



@Composable
fun MainAppRecomendaciones() {
    var currentScreen by remember { mutableStateOf("peso_altura") }

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
                "perfil" -> ProfileScreenRecomendaciones()
                "habitos" -> HabitsScreenRecomendaciones()
                "registros" -> RecordsScreenRecomendaciones()
                "peso_altura" -> WeightHeightScreenRecomendaciones()
                else -> WeightHeightScreenRecomendaciones()
            }
        }
    }
}

@Composable
fun WeightHeightScreenRecomendaciones() {
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
            text = "preguntas comunes",
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
        Spacer(modifier = Modifier.height(15.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Qué diferencia hay entre TMB y TDEE?",
                    color = TextColor,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Por qué mi TMB cambia con la edad?",
                    color = TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Cuántas calorías debo consumir al día?",
                    color = TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Qué factores afectan el metabolismo?",
                    color = TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Por qué varía el gasto calórico diario?",
                    color = TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Qué papel juega la actividad física?",
                    color = TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(6.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "¿Cómo ajustar calorías para objetivos?",
                    color = TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Composable
fun ProfileScreenRecomendaciones() {
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
fun HabitsScreenRecomendaciones() {
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
fun RecordsScreenRecomendaciones() {
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
fun MainAppRecomendacionesPreview() {
    MainAppRecomendaciones()
}
