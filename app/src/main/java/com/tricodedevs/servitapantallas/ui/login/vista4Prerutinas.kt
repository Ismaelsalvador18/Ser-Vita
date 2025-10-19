package com.tricodedevs.servita.ui.theme.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tricodedevs.servita.ui.theme.*

@Preview
@Composable
fun VistaElegirRutinas() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color_Background_App)
            .padding(
                top = 48.dp,
                bottom = 100.dp,
                start = 48.dp,
                end = 48.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Ser+ Vita",
                style = MaterialTheme.typography.titleLarge,
                color = Texto_Principal,
                fontSize = 48.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color_Background_Box,
                    shape = RoundedCornerShape(20.dp)
                )
                .border(
                    width = 3.dp,
                    color = Color_Contorno_Base,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(24.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Hemos preparado una rutina para ti",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                    color = Texto_Principal,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color_Background_Seleccionado,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Estas rutinas estarán al crear su cuenta",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    val rutinas = listOf("Agua", "Ejercicio", "Sueño", "Meditación")

                    rutinas.forEachIndexed { index, rutina ->
                        Text(
                            text = rutina,
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Texto_Principal,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.fillMaxWidth()
                        )

                        if (index != rutinas.lastIndex) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Spacer(
                                modifier = Modifier
                                    .height(2.dp)
                                    .fillMaxWidth()
                                    .background(Color_Contorno_Base)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .height(70.dp)
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = CardDefaults.cardColors(
                        containerColor = Color_Background_Seleccionado
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Crear",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center
                        )
                    }
                }


                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(70.dp)
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = CardDefaults.cardColors(
                        containerColor = Color_Background_Seleccionado
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Empezar sin rutinas",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
