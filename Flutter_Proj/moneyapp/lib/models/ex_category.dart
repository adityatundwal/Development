//Expense category class

import 'package:flutter/material.dart';
import '../constants/icons.dart';

class ExpensesCategory {
  final String title;
  int entries = 0;
  double TotalAmount = 0.0;
  final IconData icon;

  ExpensesCategory({
    required this.title,
    required this.entries,
    required this.TotalAmount,
    required this.icon,
  });

  Map<String, dynamic> toMap() => {
        'title': title,
        'entries': entries,
        'TotalAmount': TotalAmount.toString(),
      };

  factory ExpensesCategory.fromString(Map<String, dynamic> value) =>
      ExpensesCategory(
        title: value['title'],
        entries: value['entries'],
        TotalAmount: double.parse(value['TotalAmount']),
        icon: icon[value['title']]!,
      );
}
