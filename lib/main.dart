import 'package:flutter/material.dart';
import 'screens/login_screen';
import 'screens/home_dashboard.dart'; // Add your other screens here

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Water Quality Monitoring',
      theme: ThemeData(primarySwatch: Colors.blue),
      initialRoute: '/',
      routes: {
        '/': (context) => LoginScreen(),
        '/home': (context) => HomeDashboard(), // Define the home screen route
      },
    );
  }
}
