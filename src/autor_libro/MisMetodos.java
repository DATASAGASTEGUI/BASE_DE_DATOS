package autor_libro;

public class MisMetodos {

    public static int retornaCodigoAutorCiencia(Libro[] x, String cadena) {
        int idAutorAux = 0;
        Libro libro = null;
        for (int i = 0; i < x.length; i++) {
            libro = x[i]; //Objeto
            String titulo = libro.getTitulo();
            String descri = libro.getDescripcion();
            int idAutor = libro.getIdAutor();
            if (descri.equalsIgnoreCase(cadena)) {
                //Libro l5 = new Libro(5,"Física","Ciencia",250,2); 
                idAutorAux = idAutor;
                break;
            }
        }
        return idAutorAux;
    }

    public static void mostrarTitulosLibrosProgramacion(Libro[] x, String cadena) {
        for (int i = 0; i < x.length; i++) {
            String titulo = x[i].getTitulo();
            String descri = x[i].getDescripcion();
            int idAutor = x[i].getIdAutor();
            if (descri.equalsIgnoreCase(cadena)) {
                System.out.println(titulo);
            }
        }
    }
}
