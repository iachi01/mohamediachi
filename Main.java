public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 2300, 695);
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidadRetirar, float cantidadIngresar) {
        float saldoActual = cuenta.getSaldo();
        System.out.println("El saldo actual es: " + saldoActual);

        try {
            cuenta.retirar(cantidadRetirar);
            System.out.println("Se ha retirado " + cantidadRetirar + " euros de la cuenta.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            cuenta.ingresar(cantidadIngresar);
            System.out.println("Se ha ingresado " + cantidadIngresar + " euros en la cuenta.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
