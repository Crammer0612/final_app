import 'package:flutter/material.dart';

class AlertSystemScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Alerts')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            ListTile(
              title: const Text('Unsafe Water Quality Detected'),
              subtitle: const Text('Alert sent: 1 hour ago'),
              leading: const Icon(Icons.warning, color: Colors.red),
            ),
            const Divider(),
            ListTile(
              title: const Text('Turbidity Level Exceeds Limit'),
              subtitle: const Text('Alert sent: 2 hours ago'),
              leading: const Icon(Icons.warning, color: Colors.orange),
            ),
            const SizedBox(height: 20),
            SwitchListTile(
              title: const Text('Enable Push Notifications'),
              value: true,
              onChanged: (bool value) {
                // Implement notification toggle
              },
              activeColor: Colors.blueAccent,
            ),
          ],
        ),
      ),
    );
  }
}
