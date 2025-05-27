# SI_2025_lab2_243252

Filip
Nichevski
243252




![image](https://github.com/user-attachments/assets/3072b11b-d8fc-4fd5-bd30-4c89c074a956)


Цикломатска комплексност


For the `checkCart` method, we count all decision points:

if (allItems == null)`
if (item.getName() == null || item.getName().length() == 0)` → 1 `if` + 1 `||`
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)` → 1 `if` + 2 `||`
if (item.getDiscount() > 0)`
if (cardNumber != null && cardNumber.length() == 16)` → 1 `if` + 1 `&&`
if (allowed.indexOf(c) == -1)`

This gives a total of 10 logical decisions
Cyclomatic Complexity = 10

This means there are 10 independent paths to test for full code coverage.



Тест случаи според критериумот Every statement


To satisfy the Every Statement criterion, we created 6 test cases that make sure every line of the `checkCart` method is executed at least once.

1. **Null item list**: We test the case where `allItems` is `null`. This triggers the first condition in the method and throws a `RuntimeException` with the message `"allItems list can't be null!"`.

2. **Item with null name**: We test a list that contains one item with a `null` name. This activates the condition that checks whether the item's name is valid and throws a `"Invalid item!"` exception.

3. **Item with price > 300 and discount > 0**: We use an item that meets the condition for applying a penalty of `-30`, and also has a discount. This ensures both the penalty logic and the discounted price calculation are executed.

4. **Item with no discount or penalty**: We use an item with a price below 300, no discount, and a small quantity. This makes sure the `else` block of the discount check is executed and the full price is added without changes.

5. **Card number with invalid length**: We use a card number that is shorter than 16 digits. This triggers the validation logic and throws a `"Invalid card number!"` exception.

6. **Card number with invalid characters**: We use a 16-digit card number that contains non-numeric characters. This makes sure the loop that checks each character in the card number is executed, and the appropriate exception is thrown.

These six tests are the minimum needed to execute every statement in the code. With them, we achieve 100% statement coverage.




Multiple conditions critria


To cover all combinations where each subcondition individually causes the whole condition to evaluate to `true`, and also the case where the entire condition is `false`, we created the following four test cases:

1. TXX – Price > 300 (e.g., 400), other values don't matter. This tests when the first condition alone makes the whole condition true.

2. FTX – Price ≤ 300, discount > 0 (e.g., 0.1). This tests when the second condition alone makes the condition true.

3. FFT – Price ≤ 300, discount = 0, quantity > 10. This tests when the third condition alone makes the condition true.

4. FFF – Price ≤ 300, discount = 0, quantity ≤ 10.  test if whole condition is false and the penalty is not applied.

There  four cases to fully test all possible outcomes of the condition using the multiple condition criteria.



Тест случаи според критериумот Every path

The method contains 10 conditions and subconditions across several `if` statements. Considering all combinations of these conditions, the total number of possible execution paths is around 512 (excluding loop iterations). Because of this exponential growth, achieving full Every Path coverage is usually impractical. Instead, testing focuses on important paths and combines other criteria like Multiple Condition and Every Statement coverage.

 2x4x8x2x4 = 512


 


