import 'package:flutter/material.dart';

class CategoryS extends StatelessWidget {
  const CategoryS({super.key});

  static const name = '/Category_Menu';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Categories'),
      ),
    );
  }
}
