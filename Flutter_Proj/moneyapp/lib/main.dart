import 'package:flutter/material.dart';

//Screens
import 'screens/Category_Screen.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute: CategoryS.name,
      routes: {
        CategoryS.name: (_) => const CategoryS(),
      },
    );
  }
}
