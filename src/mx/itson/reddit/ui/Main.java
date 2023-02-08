/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import mx.itson.reddit.entidades.Comentario;
import mx.itson.reddit.entidades.Comunidad;
import mx.itson.reddit.entidades.Post;
import mx.itson.reddit.entidades.Usuario;

/**
 * Clase relacionada con la interfaz de usuario
 * @author Carlos Daniel Rebollo Toledo
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Usuario> usuarios = new ArrayList<>();
        
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("melani15");
        usuario1.setCorreo("melani15@gmail.com");
        usuario1.setPassword("papasconochoriz0");
        usuario1.setPais("Mexico");
        usuario1.setKarma(0);
        usuarios.add(usuario1);
        
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("mariaNieves");
        usuario2.setCorreo("nievesdelimon@gmail.com");
        usuario2.setPassword("chochobanana13");
        usuario2.setPais("Mexico");
        usuario2.setKarma(0);
        usuarios.add(usuario2);
        
        Usuario usuario3 = new Usuario();
        usuario3.setNombre("antoniaChalupa");
        usuario3.setCorreo("antoniachalupa333@gmail.com");
        usuario3.setPassword("chalupasconchamoy");
        usuario3.setPais("Argentina");
        usuario3.setKarma(0);
        usuarios.add(usuario3);  
        
        Usuario usuario4 = new Usuario();
        usuario4.setNombre("ChiefBafass");
        usuario4.setCorreo("ChiefBadass@gmail.com");
        usuario4.setPassword("paswoord");
        usuario4.setPais("Mexico");
        usuario4.setKarma(0);
        usuarios.add(usuario4);  
        
        Usuario usuario5 = new Usuario();
        usuario5.setNombre("Wefere");
        usuario5.setCorreo("Wefere@gmail.com");
        usuario5.setPassword("pancakes");
        usuario5.setPais("Chile");
        usuario5.setKarma(0);
        usuarios.add(usuario5); 
        
        Comunidad comunidad = new Comunidad();
        comunidad.setNombre("r/SinNadaQueHacer");
        comunidad.setUsuarios(usuarios);       
        
        List<Comentario> comentariosPost1 = new ArrayList<>();
        
        Comentario comentario1 = new Comentario();
        comentario1.setUsuario(usuarios.get(3));
        comentario1.setCuerpo("Todo bien?");
        comentario1.setPuntos(0);
        comentario1.setFecha(formatoFecha.parse("21/02/2020"));
        comentariosPost1.add(comentario1);
        
        Comentario comentario2 = new Comentario();
        comentario2.setUsuario(usuarios.get(2));
        comentario2.setCuerpo("Deberias de ir a checarte");
        comentario2.setPuntos(0);
        comentario2.setFecha(formatoFecha.parse("21/02/2020"));
        comentariosPost1.add(comentario2);
        
        Comentario comentario3 = new Comentario();
        comentario3.setUsuario(usuarios.get(1));
        comentario3.setCuerpo("re turbio 0_o");
        comentario3.setPuntos(0);
        comentario3.setFecha(formatoFecha.parse("21/02/2020"));
        comentariosPost1.add(comentario3);        
        
        Comentario comentario4 = new Comentario();
        comentario4.setUsuario(usuarios.get(4));
        comentario4.setCuerpo("sin comentarios...");
        comentario4.setPuntos(0);
        comentario4.setFecha(formatoFecha.parse("21/02/2020"));
        comentariosPost1.add(comentario4);
        
        List<Comentario> comentariosPost2 = new ArrayList<>();
        
        Comentario comentario5 = new Comentario();
        comentario5.setUsuario(usuarios.get(0));
        comentario5.setCuerpo("Deberias de ver la pelicula de minions, esa es muy buena");
        comentario5.setPuntos(0);
        comentario5.setFecha(formatoFecha.parse("05/03/2021"));
        comentariosPost2.add(comentario5);
        
        Comentario comentario6 = new Comentario();
        comentario6.setUsuario(usuarios.get(3));
        comentario6.setCuerpo("thanatomorphose da mucho asco");
        comentario6.setPuntos(0);
        comentario6.setFecha(formatoFecha.parse("05/03/2021"));
        comentariosPost2.add(comentario6);
        
        Comentario comentario7 = new Comentario();
        comentario7.setUsuario(usuarios.get(1));
        comentario7.setCuerpo("Las primeras peliculas de REC, deberias de verlas");
        comentario7.setPuntos(0);
        comentario7.setFecha(formatoFecha.parse("05/03/2021"));
        comentariosPost2.add(comentario7);        
        
        Comentario comentario8 = new Comentario();
        comentario8.setUsuario(usuarios.get(4));
        comentario8.setCuerpo("Saw cuenta como terror¿");
        comentario8.setPuntos(0);
        comentario8.setFecha(formatoFecha.parse("05/03/2021"));
        comentariosPost2.add(comentario8);
        
        List<Comentario> comentariosPost3 = new ArrayList<>();
        
        Comentario comentario9 = new Comentario();
        comentario9.setUsuario(usuarios.get(3));
        comentario9.setCuerpo("Muy lindoo tu gato");
        comentario9.setPuntos(0);
        comentario9.setFecha(formatoFecha.parse("10/03/2021"));
        comentariosPost3.add(comentario9);
        
        Comentario comentario10 = new Comentario();
        comentario10.setUsuario(usuarios.get(0));
        comentario10.setCuerpo("no es tan lindo como kevin el minion");
        comentario10.setPuntos(0);
        comentario10.setFecha(formatoFecha.parse("10/03/2021"));
        comentariosPost3.add(comentario10);
        
        Comentario comentario11 = new Comentario();
        comentario11.setUsuario(usuarios.get(1));
        comentario11.setCuerpo("yo tambien tengo unooo");
        comentario11.setPuntos(0);
        comentario11.setFecha(formatoFecha.parse("10/03/2021"));
        comentariosPost3.add(comentario11);        
        
        Comentario comentario12 = new Comentario();
        comentario12.setUsuario(usuarios.get(2));
        comentario12.setCuerpo("ese color de gato es muy bonito");
        comentario12.setPuntos(0);
        comentario12.setFecha(formatoFecha.parse("10/03/2021"));
        comentariosPost3.add(comentario12);
        
        List<Post> posts = new ArrayList<>();
        
        Post post1 = new Post();
        post1.setComunidad(comunidad);
        post1.setUsuario(usuarios.get(0));
        post1.setTitulo("Minion Kevin");
        post1.setCuerpo("I have an intense love for Kevin the minion from all despicable me films and the 'minions' film by universal studios.");
        post1.setFecha(formatoFecha.parse("21/02/2020"));
        post1.setPuntos(0);
        post1.setComentarios(comentariosPost1);
        posts.add(post1);
        
        Post post2 = new Post();
        post2.setComunidad(comunidad);
        post2.setUsuario(usuarios.get(2));
        post2.setTitulo("aburridoo");
        post2.setCuerpo("Ultimamente he estado interesado en peliculas de terror, recomienden algunas");
        post2.setFecha(formatoFecha.parse("05/03/2021"));
        post2.setPuntos(0);
        post2.setComentarios(comentariosPost2);
        posts.add(post2);
         
        Post post3 = new Post();
        post3.setComunidad(comunidad);
        post3.setUsuario(usuarios.get(4));
        post3.setTitulo("Miren mi gatoo");
        post3.setCuerpo("fotoGato.jpg");
        post3.setFecha(formatoFecha.parse("10/03/2021"));
        post3.setPuntos(0);
        post3.setComentarios(comentariosPost3);
        posts.add(post3);
        
        
        System.out.println(posts.get(1).getComunidad().getNombre());
        System.out.println(posts.get(1).getUsuario().getNombre()+":");
        System.out.println(posts.get(1).getTitulo());
        System.out.println(posts.get(1).getCuerpo());
        System.out.println("Fecha:"+formatoFecha.format(posts.get(1).getFecha()));
        System.out.println("Puntos: "+posts.get(1).getPuntos());
        System.out.println("\nComentarios: ");
        for(Comentario i : posts.get(1).getComentarios()){
            System.out.println("\n" + i.getUsuario().getNombre()+ ": \n" + i.getCuerpo() + "\nFecha: " + formatoFecha.format(i.getFecha()) + "\nPuntos:" + i.getPuntos());
        }

    }
}
