package com.tricodedevs.servitapantallas.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tricodedevs.servita.ui.theme.Color_Background_App
import com.tricodedevs.servita.ui.theme.Color_Background_Box
import com.tricodedevs.servita.ui.theme.Color_Background_Seleccionado
import com.tricodedevs.servita.ui.theme.Color_Contorno_Base
import com.tricodedevs.servita.ui.theme.Color_Contorno_Por_Completar
import com.tricodedevs.servita.ui.theme.Texto_Principal
import com.tricodedevs.servita.ui.theme.Texto_Secundario


@Composable
fun VistaBienvenida() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color_Background_App)
            .padding(top = 100.dp, bottom = 100.dp, start = 48.dp, end = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título principal
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

        Spacer(modifier = Modifier.height(12.dp))

        // Descripción corta
        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(color = Color_Background_Seleccionado, shape = RoundedCornerShape(10.dp))
                .padding(24.dp)
        ) {
            Text(
                text = "Cuida tu salud con hábitos diarios a tu preferencia, registra y mira tus progresos.",
                fontSize = 14.sp,
                color = Texto_Principal,
                textAlign = TextAlign.End
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Contenedor de perfiles
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color_Background_Box, shape = RoundedCornerShape(20.dp))
                .border(width = 3.dp, color = Color_Contorno_Base, shape = RoundedCornerShape(20.dp))
                .padding(24.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "Seleccione su Perfil",
                    color = Texto_Principal,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(24.dp))

                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .verticalScroll(rememberScrollState())
                ) {
                    // Perfil de ejemplo
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .padding(8.dp)
                            .border(
                                width = 2.dp,
                                color = Color_Contorno_Base,
                                shape = RoundedCornerShape(12.dp)
                            ),
                        colors = CardDefaults.cardColors(containerColor = Color_Background_App),
                        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = "Perfil de Ejemplo",
                                fontSize = 24.sp,
                                color = Texto_Principal
                            )
                        }
                    }

                    // Opción para crear nuevo perfil
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .padding(8.dp)
                            .border(
                                width = 2.dp,
                                color = Color_Contorno_Por_Completar,
                                shape = RoundedCornerShape(12.dp)
                            ),
                        colors = CardDefaults.cardColors(containerColor = Color_Background_App),
                        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = "Nuevo",
                                fontSize = 24.sp,
                                color = Texto_Principal
                            )
                        }
                    }

                    // Texto informativo inferior
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 32.dp, start = 32.dp, end = 32.dp)
                    ) {
                        Text(
                            text = "Empieza creando un perfil. Siempre puedes crear otros para otras personas.",
                            fontSize = 12.sp,
                            color = Texto_Secundario,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
