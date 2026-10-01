package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {

    val background = painterResource(
        id = R.drawable.login_background
    )

    val gambarKecil = painterResource(
        id = R.drawable.login_small
    )

    val gambarBesar = painterResource(
        id = R.drawable.login_large
    )

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        // Background
        Image(
            painter = background,
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Lapisan gelap
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color.Black.copy(alpha = 0.45f)
                )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 30.dp,
                    start = 25.dp,
                    end = 25.dp,
                    bottom = 25.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            // Teks 1
            Text(
                text = "LOGIN",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan
            )

            // Teks 2
            Text(
                text = "Selamat Datang",
                fontSize = 16.sp,
                color = Color.White
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            // Gambar kecil
            Image(
                painter = gambarKecil,
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            // Teks 3
            Text(
                text = "Nama: Sukma Hawa Iza Ghazali",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF1493)

            )

            // Teks 4
            Text(
                text = "NIM: 20240140148",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF9C27FF)
            )

            // Teks 5
            Text(
                text = "Teknologi Informasi",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF00BFFF)
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            // Gambar besar
            Image(
                painter = gambarBesar,
                contentDescription = "Gambar Utama",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .clip(
                        RoundedCornerShape(50.dp)
                    ),
                contentScale = ContentScale.Crop
            )
        }
    }
}