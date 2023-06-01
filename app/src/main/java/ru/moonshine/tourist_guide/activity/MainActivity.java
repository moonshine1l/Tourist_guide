package ru.moonshine.tourist_guide.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ru.moonshine.tourist_guide.R;
import ru.moonshine.tourist_guide.controller.ToursController;
import ru.moonshine.tourist_guide.model.Tours;

public class MainActivity extends AppCompatActivity {

    RecyclerView tourRecycler;
    ToursController toursController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Tours> tourList = new ArrayList<>();
        tourList.add(new Tours(0, "Сокотра: недельное путешествие на дикий остров драконов", "socotra", " 211463 рубля", "Сокотра — это поистине уникальный уголок Земли, изолированный в Аравийском море. Иногда кажется, что этот остров буквально откололся от другой планеты — настолько здесь не похожи ни на что другое пейзажи, растения и животный мир.", "лагуна Детвах", "Лагуна Детвах - это охраняемая территория, расположенная на слиянии Аравийского моря и течений Индийского океана. Лагуна своим ландшафтом и множеством морских птиц, скатов и других рыб странной формы представляет собой благословенную экосистему, украшенную захватывающим дух белым песчаным языком, окруженным теплыми бирюзовыми водами залива, одного из самых красивых пляжей на планете.", "Плато Диксам", "Плато Диксам занимает центральную часть Сокотры и уникально произрастающими на нем драконовыми деревьями — одним из эндемиков Сокотры. Согласно легенде, после битвы между драконами-вампирами и слонами последний раненый слон придавил телом последнего дракона, и в местах, где кровь смешалась, выросли эти удивительные растения.", "заповедник Фирмхин", "Это один из самых больших лесов драконовых деревьев на острове"));
        tourList.add(new Tours(1, "Мёртвое море в России. Баскунчак и Эльтон", "dead_sea", " 33000 рублей", "Отправляемся в путешествие к удивительным озёрам, которые по праву могут соперничать с Мёртвым морем. Это Баскунчак и Эльтон — самые большие и самые солёные из всех известных соляных озёр мира. Мы будем с вами на земле и под землёй — посетим Баскунчакскую пещеру, послушаем тишину, увидим звёздное небо, окунёмся в мир бескрайней степи. А марсианские ландшафты и поющие скалы создадут впечатление путешествия по другой планете.", "гора Богдо", "Холм или гора в Ахтубинском районе Астраханской области России, самая высокая точка Прикаспийской низменности (149,6 м над уровнем моря, 171 м над уровнем солёного озера Баскунчак).", "озеро Эльтон",  "Является крупнейшим минеральным озером Европы. С XVI века и до конца XIX века на побережье водоёма активно развивалась соляная промышленность, однако позднее, из-за чрезмерной эксплуатации соляных залежей, она была прекращена. В настоящее время побережье Эльтона является курортной зоной.", "Богдинско-Баскунчакский заповедник", "Богдинско-Баскунчакский заповедник — природная территория в 50 км к востоку от реки Ахтубы, созданная для сохранения малонарушенных полупустынных районов Астраханской области. Заповедник находится в Ахтубинском районе и отнесен ЮНЕСКО к объектам Всемирного наследия."));
        tourList.add(new Tours(2, "Фитнес-тур в горах Красной Поляны", "krasnaya_polyana", " 52300 рублей", "7 дней фитнеса в горах - спортивные, душевные, незабываемые! Горы Красной Поляны и два энергичных и заводных тренера и гида. Насыщаем лёгкие кислородом и созерцаем самые яркие краски здешних гор.", "водопад Кейва", "Водопад находится в Сочинском национальном парке на территории колхидского леса; фауна этих мест такова — медведь, волк, кабан, рысь и др.. Весной и осенью (после прохождения дождей) водопад более полноводен; летом не пересыхает и представляет собой отличное место для фотосессий.", "озеро Зеркальное",  "Зеркальное – красивое горное озеро в окрестностях Красной Поляны на высоте более 1800 метров. Свое название оно получило не зря: в безветренную погоду в нем действительно отражается как в зеркале небо и берега. С площадки, на которой оно находится, открываются отличные виды на главный хребет Кавказских гор, а в хорошую погоду можно увидеть знаменитые вершины Фишт, Оштен, Псеашхо, Аибга, Агепста.", "хребет Аибга", " горный массив к востоку от Красной Поляны, недалеко от границы с Абхазией, частично на территории Сочинского национального парка. Состоит из четырёх основных вершин: пики Аибга I (2391 м), Аибга II (2450 м), Аибга III (2462 м) и пика Чёрная Пирамида. Наивысшей точкой хребта Аибга является гора Каменный Столб (2509,7 м), расположенный в 5,5 км к юго-востоку от пика Аибга III."));
        tourList.add(new Tours(3, "Серф тур в Марокко", "morocco", " 84250 рублей", "Приглашаем участников как без навыков катания (вы освоите доску и начнете прогрессировать), так и от начального уровня и выше.", "Райская долина", "Горная местность, где находятся лагуны с пресной водой из горной реки.", "Центральный рынок (Касабланка)",  "Рынок отличается своим архитектурным стилем в неоморском стиле. Среди его наиболее примечательных особенностей - большие ворота, имитирующие стили ворот в имперских городах Марокко: Марракеше, Фесе, Рабате и Мекнесе.", "", ""));
        tourList.add(new Tours(4, "Хелиски в Узбекистане", "heliskiing_in_uzbekistan", " 70000 рублей", "Места катания на лыжах / сноубордах предлагаются в районе Западного Тянь-Шаня всего лишь в 100–150 км от столицы Узбекистана Ташкента на высотах от 2 500 м до 4 200 м над уровнем моря. Амплитуда спусков доходит до 2 км, длина спуска – до 10 км. Горы Узбекистана и технические возможности вертолета позволяют совершать спуски с вершин, гребней, перевалов. Катание проходит по склонам различной крутизны, возможно и экстремальное катание. Лыжников ждут обширные снежные поля, широкие кулуары. Есть и лесистые участки (склоны, поросшие арчой), естественные трамплины, скалы, позволяющие совершать прыжки.", "хребты Угамский, Пскемский и Чаткальский", "Места катания на лыжах / сноубордах предлагаются в районе Западного Тянь-Шаня всего лишь в 100–150 км от столицы Узбекистана Ташкента на высотах от 2 500 м до 4 200 м над уровнем моря. Амплитуда спусков доходит до 2 км, длина спуска – до 10 км. Горы Узбекистана и технические возможности вертолета позволяют совершать спуски с вершин, гребней, перевалов. Катание проходит по склонам различной крутизны, возможно и экстремальное катание. Лыжников ждут обширные снежные поля, широкие кулуары. Есть и лесистые участки (склоны, поросшие арчой), естественные трамплины, скалы, позволяющие совершать прыжки.", "",  "", "", ""));
        tourList.add(new Tours(5, "Выходные в Абхазии", "abkhazia", " 70000 м", "Для катания доступна зона альпийских лугов и лес с широко стоящими деревьями. Перепад высот может доходить до 900 метров за спуск. За один выход есть возможность покататься по всем видам рельефа. Максимальная высота не превышает 3000 метров. Просторы и свободные от леса зоны начинаются с 2000. До этой отметки мы доберемся на снегоходах.", "г. Аджара", "г. Аджара (база расположена в 12 километрах от озера Рица). Ближайшая и самая удобная локация для катания перевал Пыв на высоте 2000 метров. С перевала открываются спуски разной сложности.", "г. Мамдзышха",  "Место в котором море подходит к горе. У её подножья расположен г. Гагра. От города начинается подъем вверх. Причина выбора этого места снег, который лежит с декабря по май и близость к морю. Сочетание морского и горного воздуха делает место уникальным.", "", ""));
        tourList.add(new Tours(6, "Целебные воды Кавказа", "healing_waters_of_the_caucasus", " 14800 рублей", "В туре «Целебные воды Кавказа» вы не только посетите множество значимых исторических мест Кавказских Минеральных Вод и Кабардино-Балкарии, но ещё и сможете попробовать уникальную минеральную воду, знаменитую своими оздоровительными свойствами. ", "Парк «Цветник»", "Парк «Цветник» - одна из основных достопримечательностей Пятигорска - расположен в старейшей его части и тянется вдоль небольшого отрезка проспекта Кирова. Это исторический и культурный центр города. В этих местах, у основания горы Горячей, было положено начало строительства курорта в 20-х годах 19 столетия. Из истории города известно, что первый источник был открыт именно на этой горе, и первый стихийно возникший поселок назывался - Горячие Воды. ", "озеро Провал",  "Озеро Провал — уникальная природная достопримечательность, расположенная в Пятигорске, на горе Машук. Его обнаружили в результате провала известняковых пород. Водоем обладает необычным голубым цветом, который получил благодаря сере и бактериям. ", "Эльбрус", "Уникальная и самая загадочная гора Кавказского курорта привлекает миллионы туристов со всех уголков России и зарубежных стран. Люди стремятся к Эльбрусу за удивительными пейзажами, впечатлениями, но и пытаются проверить свои силы, прочность, но и даже за здоровьем, счастьем, потому что Эльбрус – самая мистическая, загадочная гора Кавказа."));
        tourList.add(new Tours(7, "Тайны океана", "secrets_of_the_ocean", " 182000 рублей", "Этот круиз уже стал классикой нашего летнего сезона. Совместно с учеными-биологами из проекта FEROP (Far East Russian Orca Project) мы откроем для вас мир косаток, расскажем, как сильно они отличаются друг от друга, а в чем похожи. Объясним, что общего между людьми и косатками. И вы примете участие в научно-исследовательской деятельности ученых.", "Долина Гейзеров", "Долина гейзеров — это одно из самых больших на планете гейзерных полей, расположенное на территории России, в Камчатском крае. Природный объект представляет собой каньон, в котором сосредоточены гейзеры, геотермальные площадки, озёра, ручьи и водопады с тёплой и горячей водой. Долина гейзеров относится к Кроноцкому государственному биосферному заповеднику и является уникальным памятником природы.", "вулкан Горелый",  "Вулкан Горелый — вулкан, расположенный в южной части Камчатки. Входит в состав Восточно-Камчатского вулканического пояса, в настоящее время активен, обладает долгоживущим достаточно крупным щитовым эруптивным центром. Высота над уровнем моря равна 1829 метрам, состоит из андезитов и дацитов. Основу вулкана образовывают пять перекрывающихся стратовулканов.", "горный массив Вачкажец", "Горный массив является памятником природы и включён в “Перечень особо охраняемых природных территорий регионального и местного значения Камчатского края”.  В легкодоступном от города месте располагаются удивительные горные пейзажи разрушенного древнего вулкана Вачкажец. Здесь вы найдете редкие растения занесенные в Красную книгу, ледниковые озера, голубые снежники."));

        setTourRecycler(tourList);
    }

    private void setTourRecycler(List<Tours> tourList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        tourRecycler = findViewById(R.id.tourRecycler);
        tourRecycler.setLayoutManager(layoutManager);

        toursController = new ToursController(this, tourList);
        tourRecycler.setAdapter(toursController);
    }
}