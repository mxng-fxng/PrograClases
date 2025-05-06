public class Assert {
  private Assert() { }

  public static void assertTrue(boolean c) {
    if (!c)
      throw new RuntimeException("\nERROR: la condición no es cierta");
  }

  public static void assertEq(Object a, Object b) {
    if (a != b)
      throw new RuntimeException(String.format(
              "\nERROR: Los objetos 0x%08x y 0x%08x NO son el MISMO objeto",
              System.identityHashCode(a), System.identityHashCode(b)
            ));
  }

  public static void assertNotEq(Object a, Object b) {
    if (a == b)
      throw new RuntimeException(String.format(
              "\nERROR: Los objetos 0x%08x y 0x%08x SON el MISMO objeto",
              System.identityHashCode(a), System.identityHashCode(b)
            ));
  }

  public static void assertEquals(Object a, Object b) {
    if (!a.equals(b))
      throw new RuntimeException(String.format(
              "\nERROR: Los objetos \"%s\" (0x%08x) y \"%s\" (0x%08x) NO son IGUALES",
              a, System.identityHashCode(a), b, System.identityHashCode(b)
            ));
  }

  public static void assertNotEquals(Object a, Object b) {
    if (a.equals(b))
      throw new RuntimeException(String.format(
              "\nERROR: Los objetos \"%s\" (0x%08x) y \"%s\" (0x%08x) SON IGUALES",
              a, System.identityHashCode(a), b, System.identityHashCode(b)
            ));
  }

  public static void assertError(Code code) {
    Throwable error = null;
    try { code.run(); } catch (Exception e) { error = e; }
    if (error == null)
      throw new RuntimeException("\nERROR: Se esperaba un error que no se ha producido");
  }

  public static void assertNotError(Code code) {
    Throwable error = null;
    try { code.run(); } catch (Exception e) { error = e; }
    if (error != null)
      throw new RuntimeException("\nERROR: No se esperaba el error " + error);
  }

  public static interface Code {void run() throws Exception;}
}
