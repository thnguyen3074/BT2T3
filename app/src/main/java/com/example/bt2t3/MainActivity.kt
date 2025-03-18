package com.example.bt2t3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "home") {
                composable("home") { OnboardingScreen(navController) }
                composable("SecondScreen") { SecondScreen(navController) }
                composable("ThirdScreen") { ThirdScreen(navController) }
                composable("GetStartedScreen") { GetStartedScreen(navController) }
            }
        }
    }
}

@Composable
fun OnboardingScreen(navController: NavController) {
    Box ( modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 16.dp, vertical = 32.dp),

        ){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Page Dots (Indicator)
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // Assuming you want 3 dots, you can dynamically change this later
                repeat(3) { index ->
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(
                                if (index == 0) Color(0xFF006EE9) else Color(0xFFEEF5FD),
                                shape = CircleShape
                            )
                    )
                }
            }
            // Skip Button
            Text(
                text = "Skip",
                color = Color(0xFF006EE9),
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.clickable {navController.navigate("GetStartedScreen")}
            )
        }
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 180.dp)
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center // Center the elements
        )

        {

            Image(
                painter = painterResource(id = R.drawable.bro), // Replace with your image resource
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxWidth() // Image takes full width
                    .height(250.dp) // Adjust the height as needed
            )

            Spacer(modifier = Modifier.height(16.dp)) // Space between image and text

            // Title
            Text(
                text = "Increase Work Effectiveness",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
            )

            // Description
            Text(
                text = "With management based on priority and daily tasks, it will give you convenience in managing and determining the tasks that must be done first",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color(0xFF4A4646),
                    fontSize = 14.sp,
                ),
                modifier = Modifier.padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {navController.navigate("SecondScreen")},
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2196F3)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun SecondScreen(navController: NavController) {
    Box ( modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 16.dp, vertical = 32.dp),

        ){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Page Dots (Indicator)
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // Assuming you want 3 dots, you can dynamically change this later
                repeat(3) { index ->
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(
                                if (index == 1) Color(0xFF006EE9) else Color(0xFFEEF5FD),
                                shape = CircleShape
                            )
                    )
                }
            }
            // Skip Button
            Text(
                text = "Skip",
                color = Color(0xFF006EE9),
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.clickable {navController.navigate("GetStartedScreen")}
            )
        }
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 180.dp)
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center // Center the elements
        )

        {

            Image(
                painter = painterResource(id = R.drawable.img_1), // Replace with your image resource
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxWidth() // Image takes full width
                    .height(250.dp) // Adjust the height as needed
            )

            Spacer(modifier = Modifier.height(16.dp)) // Space between image and text

            // Title
            Text(
                text = "Easy Time Management",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
            )

            // Description
            Text(
                text = "Time management and the determination of more important tasks will give your job statistics better and always improve",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color(0xFF4A4646),
                    fontSize = 14.sp,
                ),
                modifier = Modifier.padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Nút "Back" với hình ảnh
            Image(
                painter = painterResource(id = R.drawable.img_2), // Đổi thành tài nguyên hình ảnh của bạn
                contentDescription = "Back",
                modifier = Modifier
                    .size(48.dp)
                    .clickable {navController.popBackStack()}

            )

            // Nút "Next"
            Button(
                onClick = {navController.navigate("ThirdScreen")},
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2196F3)
                ),
                modifier = Modifier
                    .height(52.dp)
                    .width(260.dp),
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun ThirdScreen(navController: NavController) {
    Box ( modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 16.dp, vertical = 32.dp),

        ){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                repeat(3) { index ->
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(
                                if (index == 2) Color(0xFF006EE9) else Color(0xFFEEF5FD),
                                shape = CircleShape
                            )
                    )
                }
            }
            Text(
                text = "Skip",
                color = Color(0xFF006EE9),
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.clickable {navController.navigate("GetStartedScreen")}
            )
        }
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 180.dp)
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center // Center the elements
        )

        {

            Image(
                painter = painterResource(id = R.drawable.img_3), // Replace with your image resource
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxWidth() // Image takes full width
                    .height(250.dp) // Adjust the height as needed
            )

            Spacer(modifier = Modifier.height(16.dp)) // Space between image and text

            Text(
                text = "Reminder Notification",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
            )

            Text(
                text = "The advantage of this application is that it also provides reminders for you so you don't forget to keep doing your assignments well and according to the time you have set",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color(0xFF4A4646),
                    fontSize = 14.sp,
                ),
                modifier = Modifier.padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Nút "Back" với hình ảnh
            Image(
                painter = painterResource(id = R.drawable.img_2), // Đổi thành tài nguyên hình ảnh của bạn
                contentDescription = "Back",
                modifier = Modifier
                    .size(48.dp)
                    .clickable {navController.popBackStack()}

            )

            // Nút "Next"
            Button(
                onClick = {navController.navigate("GetStartedScreen")},
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2196F3)
                ),
                modifier = Modifier
                    .height(52.dp)
                    .width(260.dp),
            ) {
                Text(
                    text = "Get Started",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold
                )

            }
        }
    }
}

@Composable
fun GetStartedScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Get Started",
            fontSize = 24.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OnboardingScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview() {
    ThirdScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun GetStartedScreenPreview() {
    GetStartedScreen(navController = rememberNavController())
}