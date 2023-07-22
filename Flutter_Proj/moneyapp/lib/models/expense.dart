class Expense {
  final int id;
  final String title;
  final double amount;
  final DateTime date;

  final String category;

  Expense({
    required this.id,
    required this.title,
    required this.amount,
    required this.date,
    required this.category,
  });


  Map<String,dynamic> toMap() => {
    'title' : title,
    'amount' : amount.toString(),
    'date' : date.toString(),
    'category': category,
  };

  factory Expense.fromString(Map)
};
