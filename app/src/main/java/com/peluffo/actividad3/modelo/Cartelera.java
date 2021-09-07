package com.peluffo.actividad3.modelo;

import androidx.lifecycle.ViewModel;

import com.peluffo.actividad3.R;

import java.util.ArrayList;
import java.util.List;

public class Cartelera {
    public List<Pelicula> cargarPeliculas(){
        ArrayList<Pelicula> pelis = new ArrayList<>();
        pelis.add(new Pelicula("Martyrs", "Pascal Laugier",
                "Mylène Jampanoï, Morjana Alaoui, Catherine Bégin, Robert Toupin, Patricia Tulasne, Juliette Gosselin, Xavier Dolan",
                "En Francia, a comienzos de 1970, Lucie, una niña desaparecida un año antes, es vista mientras camina por una carretera." +
                        "Se encuentra en estado catatónico y es incapaz de contar nada de lo que le ha sucedido.",
                R.drawable.imagen1));
        pelis.add(new Pelicula("Naked Lunch", "David Cronenberg",
                "Peter Weller, Judy Davis, Ian Holm, Julian Sands, Roy Scheider, Nicholas Campbell, Monique Mercure," +
                        "Michael Zelniker, Joseph Scorsiani, Robert A. Silverman, Peter Boretski, Yuval Daniel, John Friesen, Sean McCann," +
                        "Howard Jerome, Michael Caruana, Kurt Reis, Justin Louis, Julian Richings, Jim Yip, Claude Aflalo, Laurent Hazout," +
                        "Joseph Di Mambro",
                "Después del trágico accidente sufrido por su mujer, un escritor que cae en la adicción a ciertas drogas," +
                        "empieza a sufrir horribles alucinaciones que lo transportan a un mundo de pesadilla absolutamente kafkiano",
                R.drawable.imagen2));
        pelis.add(new Pelicula("Bizita Q", "Takashi Miike",
                "Ken'ichi Endô, Fujiko, Jun Moto, Shoko Nakahara, Shungiku Uchida, Ikko Suzuki, Kazushi Watanabe",
                "Un reportero televisivo, que cayó en el olvido profesional tras haber sido atacado por jóvenes pandilleros" +
                        "(quienes grabaron toda la escena en una cámara), trata de realizar un documental acerca de la violencia juvenil y el sexo.",
                R.drawable.imagen3));
        pelis.add(new Pelicula("Men Behind the Sun", "Mou Tun-Fei",
                "Wang Gang, Hsu Gou, Zhe Quan, Runsheng Wang, Dai Yao Wu, Zhaohua Mei, Tie Long Jin, Andrew Yu",
                "Durante la Segunda Guerra Mundial, el \"Escuadrón 731\" Japonés tomó numerosos prisioneros que fueron asesinados " +
                        "durante el proceso de creación de armas de ataque bacteriológico.",
                R.drawable.imagen4));
        pelis.add(new Pelicula("A Serbian Film", "Srdjan Spasojevic",
                "Srdjan Todorovic, Sergej Trifunovic, Jelena Gavrilovic, Katarina Zutic, Slobodan Bestic, Ana Sakic," +
                        "Lena Bogdanovic, Luka Mijatovic, Andjela Nenadovic",
                "Milos, un actor porno ya retirado, está pasando por apuros económicos. Un director le ofrece trabajar en su nuevo film. " +
                        "Él sospecha que hay algo muy turbio detrás de ese proyecto, pero cuando intenta renunciar ya es demasiado tarde.",
                R.drawable.imagen5));
        pelis.add(new Pelicula("Cannibal Holocaust", "Ruggero Deodato",
                "Robert Kerman, Francesca Ciardi, Perry Pirkanen, Luca Barbareschi, Salvatore Basile, Carl Gabriel Yorke," +
                        "Ricardo Fuentes",
                "Cuatro jóvenes documentalistas se adentran en la selva amazónica " +
                        "para realizar un reportaje sobre las tribus que habitan en esa región. " +
                        "Debido a la desaparición de los reporteros, un grupo de rescate es enviado para averiguar qué ha sido de ellos.",
                R.drawable.imagen6));
        pelis.add(new Pelicula("Salò", "Pier Paolo Pasolini",
                "Paolo Bonacelli, Giorgio Cataldi, Umberto Paolo Quintavalle, Aldo Valletti, Caterina Boratto," +
                        "Elsa De Giorgi, Sonia Saviange, Laura Betti",
                "En una mansión, cuatro señores se reúnen con un grupo de jóvenes " +
                        "que han sido hechos prisioneros. Nadie puede eludir las reglas del juego " +
                        "establecidas por los señores; ellos gozan de la facultad de disponer a su antojo de la vida de los cautivos",
                R.drawable.imagen7));
        return pelis;
    }
}
