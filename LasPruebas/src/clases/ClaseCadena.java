package clases;

public class ClaseCadena {

    public static void DevuelveIniciales(String nombreApellidos) {
        // Aplicacion del patron de diseño facade
        StringBuffer iniciales = new StringBuffer();
        if (nombreApellidos == null || nombreApellidos.equals("")) {
            iniciales.append("");
        } else {
            for (int i = 0; i < nombreApellidos.length(); i++) {
                if (Character.isUpperCase(nombreApellidos.charAt(i))) {
                    iniciales.append(nombreApellidos.charAt(i) + ".");
                }
            }
            System.out.println(iniciales);
        }
    }
}