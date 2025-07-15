package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Book;

public class LibroController {
    public Set<Book> procesarLibros(List<Book> libros) {
    Comparator<Book> criterio = (b1, b2) -> {
        int cmpTitulo = b2.getTitulo().compareToIgnoreCase(b1.getTitulo()); // Descendente
        if (cmpTitulo != 0) return cmpTitulo;

        int cmpAnio = Integer.compare(b1.getAnio(), b2.getAnio()); // Ascendente
        return cmpAnio;
    };

    Set<Book> setOrdenado = new TreeSet<>(criterio);
    setOrdenado.addAll(libros);
    return setOrdenado;
}
}

