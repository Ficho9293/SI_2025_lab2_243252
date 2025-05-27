@Test
public void testMultipleCondition() {
    List<Item> items;

    // price > 300
    items = new ArrayList<>();
    items.add(new Item("Item", 1, 350, 0));
    double res1 = SILab2.checkCart(items, "1234567890123456");

    // discount > 0
    items = new ArrayList<>();
    items.add(new Item("Item", 1, 100, 0.2));
    double res2 = SILab2.checkCart(items, "1234567890123456");

    // quantity > 10
    items = new ArrayList<>();
    items.add(new Item("Item", 11, 50, 0));
    double res3 = SILab2.checkCart(items, "1234567890123456");

    // none true
    items = new ArrayList<>();
    items.add(new Item("Item", 5, 100, 0));
    double res4 = SILab2.checkCart(items, "1234567890123456");

    // Assertions, e.g.
    assertTrue(res1 > 0);
    assertTrue(res2 > 0);
    assertTrue(res3 > 0);
    assertTrue(res4 > 0);
}
