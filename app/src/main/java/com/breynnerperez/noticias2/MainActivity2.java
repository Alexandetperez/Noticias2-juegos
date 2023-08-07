package com.breynnerperez.noticias2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;
    private List<NewsItem> newsItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializa la lista de noticias (simulada o desde una API)
        newsItems = new ArrayList<>();

// Agrega noticias de ejemplo
        newsItems.add(new NewsItem(
                "Competencia mundial de eSports anunciada",
                "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2023/07/ea-sports-fc-24-todo-sabemos-sucesor-fifa-24-3084248.jpg?tf=1200x",
                "Se ha anunciado una nueva competencia de eSports a nivel mundial con grandes premios en efectivo. ¡Prepárate para la batalla!",
                "https://www.hobbyconsolas.com/reportajes/ea-sports-fc-24-todo-sabemos-ahora-sustituto-fifa-24-1274272"));
        newsItems.add(new NewsItem(
                "Ganadores del torneo internacional de eSports",
                "https://s3.amazonaws.com/arc-wordpress-client-uploads/infobae-wp/wp-content/uploads/2019/08/16092403/Infamous-gaming-2019-1920.jpg",
                "El torneo internacional de eSports llegó a su fin con emocionantes partidas y sorpresas. Descubre quiénes se llevaron a casa los trofeos y premios.",
                "https://www.infobae.com/latinpower/esports/2022/11/13/ano-mundialista-quienes-fueron-los-grandes-ganadores-de-los-esports-durante-el-2022/"));
        newsItems.add(new NewsItem(
                "Lanzamiento de edición especial con contenido exclusivo",
                "https://www.callofduty.com/content/dam/atvi/callofduty/cod-touchui/blog/hero/mwii/MWII-S04R-ANNOUNCEMENT-TOUT.jpg",
                "Se anuncia el lanzamiento de una edición especial de un juego con contenido exclusivo, incluyendo trajes, armas y más.",
                "https://www.callofduty.com/es/blog/2023/07/call-of-duty-modern-warfare-II-warzone-season-04-reloaded-battle-royale-content-drop"));

        newsItems.add(new NewsItem(
                "Actualización de equilibrio en juego competitivo",
                "https://www.callofduty.com/content/dam/atvi/callofduty/cod-touchui/blog/hero/codm/CODM-7-HEAT-WAVE-TOUT.jpg",
                "Una nueva actualización de equilibrio ha llegado a un juego competitivo, ajustando personajes y mecánicas para garantizar partidas justas y emocionantes.",
                "https://www.callofduty.com/es/blog/2023/07/call-of-duty-mobile-season-7-2023-heat-wave-maps-modes-themed-event"));
        newsItems.add(new NewsItem(
                "Nuevo personaje llega a Apex Legends",
                "https://media.contentapi.ea.com/content/dam/apex-legends/common/neon-network-event/apex-neon-network-event-primary-art-3840x2160.jpg.adapt.crop16x9.431p.jpg",
                "La temporada actual trae consigo un nuevo personaje jugable, que posee habilidades únicas que cambiarán el metajuego de Apex Legends.",
                "https://www.ea.com/es-es/games/apex-legends/news/neon-network-event"));
        newsItems.add(new NewsItem(
                "Nueva actualización de PUBG mejora el rendimiento",
                "https://static1-es.millenium.gg/articles/3/49/53/3/@/270646-pubg-1-orig-1-article_image_d-1.jpg",
                "La última actualización de PUBG se enfoca en mejorar el rendimiento y solucionar varios problemas de estabilidad en el juego.",
                "https://www.somosxbox.com/la-nueva-actualizacion-de-pubg-ofrece-una-notable-mejoria-de-rendimiento/804413"));
        newsItems.add(new NewsItem(
                "Detalles revelados sobre el próximo Assassin's Creed",
                "https://media.vandal.net/i/1200x630/9-2022/2022911151314_1.jpg",
                "Ubisoft ha compartido detalles emocionantes sobre la trama y la ambientación del próximo juego de la saga Assassin's Creed.",
                "https://vandal.elespanol.com/noticia/1350756206/assassins-creed-mirage-se-filtra-su-logo-y-el-arte-de-una-de-sus-misiones/"));
        newsItems.add(new NewsItem(
                "Colaboración sorpresa de Fall Guys con otra franquicia",
                "https://top-mmo.fr/wp-content/uploads/2022/10/Fortnite-Fall-Guys-crossover-1000x580.jpg",
                "Se ha anunciado una colaboración inesperada entre Fall Guys y otra franquicia popular, lo que traerá trajes exclusivos y emocionantes modos de juego.",
                "https://top-mmo.fr/es/La-filtraci%C3%B3n-de-la-colaboraci%C3%B3n-de-Fortnite-x-Fall-Guys-podr%C3%ADa-llegar-pronto/"));
        newsItems.add(new NewsItem(
                "Nueva línea de barcos llega a World of Warships",
                "https://apps-on-mac.com/wp-content/uploads/2022/05/play-world-of-warships-on-mac.jpg",
                "Una nueva línea de barcos se ha añadido al juego, permitiendo a los jugadores experimentar con naves únicas y estrategias frescas.",
                "https://www.reporteindigo.com/indigo-geek/world-of-warships-legends-trae-mas-buques-de-nivel-viii/"));


        newsAdapter = new NewsAdapter(newsItems, this);
        recyclerView.setAdapter(newsAdapter);
    }
}