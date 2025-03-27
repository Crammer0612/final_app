import 'package:flutter/material.dart';

class HomeDashboardScreen extends StatelessWidget {
  const HomeDashboardScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Home Dashboard'),
        backgroundColor: Colors.blueAccent,
      ),
      body: Center(
        child: const Text(
          'Welcome to the Home Dashboard!',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}