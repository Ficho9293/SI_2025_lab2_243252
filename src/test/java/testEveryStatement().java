@Test
public void testEveryStatement() {
    List<Item> items = new ArrayList<>();
    items.add(new Item("Item1", 5, 100, 0.0));      // normal case
    items.add(new Item("Item2", 12, 50, 0.0));      // quantity > 10 triggers discount -30
    items.add(new Item("Item3", 1, 350, 0.0));      // price > 300 triggers discount -30
    items.add(new Item("Item4", 1, 200, 0.1));      // discount > 0 triggers discount calculation

    double result = SILab2.checkCart(items, "1234567890123456");
    // Add assertions with expected sum value
    assertEquals(expectedSum, result, 0.01);
}