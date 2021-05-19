package com.example.projekt_zaliczeniowy;

import android.view.View;

public class Story {

    Ekran_gry gs;
    String nextPosition1, nextPosition2;

    public Story(Ekran_gry gs){

        this.gs = gs;

    }

    public void selectPosition(String position){

        switch(position){
            case "StartingPoint": StartingPoint();break;
            case "słucham": słucham();break;
            case "wisielec": wisielec();break;
            case "obezwładnienie": obezwładnienie();break;
            case "korytarz": korytarz();break;
            case "śmierć": śmierć();break;
            case "śmierć2": śmierć2();break;
            case "śmierć3": śmierć3();break;
            case "śmierć4": śmierć4();break;
            case "śmierć5": śmierć5();break;
            case "okno": okno();break;
            case "skrzynka": skrzynka();break;
            case "klucze": klucze();break;
            case "drzwi": drzwi();break;
            case "śpiący": śpiący();break;
            case "ciche_zabójstwo": ciche_zabójstwo();break;
            case "KoniecWiezienia": KoniecWiezienia();break;


            //LAS


            case "LAS" : LAS();break;
            case "strażnicy" : strażnicy();break;
            case "śmierć_psy": śmierć_psy();break;
            case "śmierć_psy2": śmierć_psy2();break;
            case "śmierć_głód": śmierć_głód();break;
            case "śmierć_las": śmierć_las();break;
            case "śmierć_piwnica": śmierć_piwnica();break;
            case "śmierć_strażnica": śmierć_strażnica();break;
            case "Staw": Staw();break;
            case "ścieżka": ścieżka();break;
            case "głębia": głębia();break;
            case "obozowisko": obozowisko();break;
            case "spotkanie": spotkanie();break;
            case "karczma": karczma();break;
            case "karczmarz": karczmarz();break;
            case "wskazówka": wskazówka();break;
            case "rozwidlenie": rozwidlenie();break;
            case "KoniecLasu": KoniecLasu();break;
            case "KoniecLasu_Podwózka": KoniecLasu_Podwózka();break;
        }
    }

    public void StartingPoint(){

        gs.image.setImageResource(R.drawable.windowbars);
        gs.text.setText("Budzisz się w celi i słyszysz głosy ludzi w nieznanym ci języku. Co chwila po korytarzu przechodzi jakiś człowiek z przypiętymi kluczami do swojego paska. \n\nCo robisz?");

        gs.button1.setText("Nasłuchuję");
        gs.button2.setText("Idę spać dalej");
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);

        nextPosition1 = "słucham";
        nextPosition2 = "wisielec";

    }

    public void śmierć(){

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nnatrafiasz na dwóch strażników, którzy cię mordują...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void śmierć2(){

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nLądujesz na oblodzoną powierzchnie, po czym tracąc równowage spadasz w ogromną przepaść...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void śmierć3(){

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nTrafiasz na zamknięte drzwi z których po chwili wychodzi strażnik, który cię zabija...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void śmierć4(){

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nZza rogu wychodzi strażnik, który cię zabija...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void śmierć5(){

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nZachaczas o garnek na ziemi, co skutkuje obudzeniem strażnika, który Cię zabija...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void wisielec() {

        gs.image.setImageResource(R.drawable.gibbet);
        gs.text.setText("KONIEC GRY \n\nZostajesz w tej celi przez następne kilka dni po czym trafiasz na szubienicę...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void słucham(){

        gs.image.setImageResource(R.drawable.brokenwall);
        gs.text.setText("Kojarzysz język. Jest to hiszpański. Uczyłeś się go przecież w liceum. W międzyczasie widzisz luźną cegłę w ścianie. \n\nCo robisz?");

        gs.button1.setText("Wyicągam ją i próbuję ogłuszyć strażnika");
        gs.button2.setText("Zostawiam i idę spać dalej");

        nextPosition1 = "obezwładnienie";
        nextPosition2 = "wisielec";

    }

    public void obezwładnienie(){

        gs.image.setImageResource(R.drawable.stonedskull);
        gs.text.setText("Sukces! Udało ci się obezwładnić strażnika. \n\nCo robisz?");

        gs.button1.setText("Sięgam po klucze i otwieram celę");
        gs.button2.setText("Ide spać dalej");

        nextPosition1 = "korytarz";
        nextPosition2 = "wisielec";

    }

    public void korytarz(){

        gs.image.setImageResource(R.drawable.dungeonlight);
        gs.text.setText("Wychodzisz na korytarz! Po prawej stronie za rogiem widzisz dwa cienie innych strażników, z lewej zaś czujesz zimne podmuchy wiatru. \n\nCo robisz?");

        gs.button1.setText("Idę w lewo");
        gs.button2.setText("Idę w prawo");

        nextPosition1 = "okno";
        nextPosition2 = "śmierć";

    }

    public void okno(){

        gs.image.setImageResource(R.drawable.mountains);
        gs.text.setText("Czujesz coraz mocniejsze podmuchy wiatru. Docierasz do otwartego okna. Widzisz że znajdujesz się w górach, najprawdopodobniej w Andach w Ameryce Południowej. \n\nCo robisz?");

        gs.button1.setText("Wyskakuję przez okno");
        gs.button2.setText("Idę dalej korytarzem");

        nextPosition1 = "śmierć2";
        nextPosition2 = "skrzynka";

    }

    public void skrzynka(){

        gs.image.setImageResource(R.drawable.lockedchest);
        gs.text.setText("Idąc dalej natrafiasz na skrzynię. \n\nCo robisz?");

        gs.button1.setText("Otwieram");
        gs.button2.setText("Idę dalej korytarzem");

        nextPosition1 = "klucze";
        nextPosition2 = "śmierć3";

    }

    public void klucze(){

        gs.image.setImageResource(R.drawable.keyring);
        gs.text.setText("Gratulacje! W szafce znalazłeś klucze, monety oraz nóż. \n\nCo robisz?");

        gs.button1.setText("Zawracam");
        gs.button2.setText("Idę dalej wzdłóż korytarza");

        nextPosition1 = "śmierć";
        nextPosition2 = "drzwi";

    }

    public void drzwi(){

        gs.image.setImageResource(R.drawable.lockeddoor);
        gs.text.setText("Natrafiasz na zamknięte drzwi. \n\nCo robisz?");

        gs.button1.setText("Otwieram po cichu używając klucza");
        gs.button2.setText("Wyłamujesz drzwi mocnym kopnięciem");

        nextPosition1 = "śpiący";
        nextPosition2 = "śmierć4";

    }

    public void śpiący(){

        gs.image.setImageResource(R.drawable.sleepingbag);
        gs.text.setText("Na ziemi, w śpiworze widzisz śpiącego strażnika. \n\nCo robisz?");

        gs.button1.setText("Zabiajam go po cichu, wykorzystując nóż");
        gs.button2.setText("Omijam i idę w stronę kolejnych drzwi");

        nextPosition1 = "ciche_zabójstwo";
        nextPosition2 = "śmierć5";

    }

    public void ciche_zabójstwo(){

        gs.image.setImageResource(R.drawable.choppedskull);
        gs.text.setText("SUKCES! Udało Ci się go wyeliminować nie powiadamiając przy tym innych strażników. \n\nCo robisz?");

        gs.button1.setText("Zawracam");
        gs.button2.setText("Idę w stronę kolejnych drzwi");

        nextPosition1 = "śmierć";
        nextPosition2 = "KoniecWiezienia";

    }

    public void KoniecWiezienia(){

        gs.image.setImageResource(R.drawable.evasion);
        gs.text.setText("BRAWO! Udało Ci się ucieć z więzienia! Teraz tylko pozostaje pytanie. Dlaczego tam trafiłeś? \n\nCDN...");

        gs.button1.setText("");
        gs.button1.setVisibility(View.INVISIBLE);
        gs.button2.setText("Kolejny poziom");


        nextPosition1 = "";
        nextPosition2 = "LAS";

    }


    //LAS


    public void LAS(){

        gs.image.setImageResource(R.drawable.forestentrance);
        gs.text.setText("Kiedy już opuściłeś mury więzienia, zdajesz sobie sprawę, że przed tobą rysuje się ogramony ciemny i mroczny las. \n\nCo robisz?");

        gs.button1.setText("Wchodzę w głąb lasu");
        gs.button2.setText("Wracam do więzienia");
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);

        nextPosition1 = "strażnicy";
        nextPosition2 = "śmierć";

    }

    public void śmierć_psy() {

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nstrażnicy cię doganiają i zostajesz zagryzony przed psy...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "LAS";
    }

    public void śmierć_psy2() {

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nPo chwili znowu natrafiasz na strażników. Tym razem nie masz gdzie uciec i zostajesz zagryzony przed psy...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "LAS";
    }

    public void śmierć_głód() {

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\nZgubiłeś się w lesie. Próbujesz wrócić na szlak, ale nic z tego. Umierasz z głodu i przemęczenia...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "LAS";
    }

    public void śmierć_las() {

        gs.image.setImageResource(R.drawable.deadhead);
        gs.text.setText("KONIEC GRY \n\n Mężczyźni zabijają cię z zimną krwią...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "LAS";
    }

    public void śmierć_piwnica() {

        gs.image.setImageResource(R.drawable.musclefat);
        gs.text.setText("KONIEC GRY \n\n Przy drzwiach wejściowych zostajesz złapany przez wilkiego osiłka, który po kilku godzinach spędzonych w piwnicy, wydaje Cię strażnikom z więzienia...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "LAS";
    }

    public void śmierć_strażnica() {

        gs.image.setImageResource(R.drawable.guardedtower);
        gs.text.setText("KONIEC GRY \n\n Docierasz do strażnicy, gzie zostajesz rozpoznany i z powrotem trafiasz do więzienia...");

        gs.button1.setText("");
        gs.button2.setText("Zagraj jeszcze raz");
        gs.button1.setVisibility(View.INVISIBLE);

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void strażnicy(){

        gs.image.setImageResource(R.drawable.sniffingdog);
        gs.text.setText("Po przejściu kilkuset metrów słyszysz coraz głośniej, że zbliża się do ciebie grupa strażników razem z psami. \n\nCo robisz?");

        gs.button1.setText("Wskakuję do małego stawu i nacieram się błotem w celu lepszego zakamuflowania się przed strażnikami i ich psami");
        gs.button2.setText("biegnę dale w las");

        nextPosition1 = "Staw";
        nextPosition2 = "śmierć_psy";

    }

    public void Staw(){

        gs.image.setImageResource(R.drawable.swamp);
        gs.text.setText("Dobry wybór. Grupa poszukiwawcza Cię ominęła \n\nCo robisz?");

        gs.button1.setText("Wychodzisz i idziesz dalej w głąb lasu");
        gs.button2.setText("Czekasz dalej w stawie przez jeszcze kilkadziesiąt minut");

        nextPosition1 = "śmierć_psy2";
        nextPosition2 = "ścieżka";

    }

    public void ścieżka(){

        gs.image.setImageResource(R.drawable.trail);
        gs.text.setText("Wychodzisz ze stawu i widzisz scieżkę. \n\nCo robisz?");

        gs.button1.setText("Podążasz jej szlakiem");
        gs.button2.setText("idziesz dalej w głąb lasu");

        nextPosition1 = "obozowisko";
        nextPosition2 = "głębia";

    }

    public void głębia(){

        gs.image.setImageResource(R.drawable.forest);
        gs.text.setText("Wszedłeś tak głęboko w las, że nie masz kompletnie pojęcia gdzie jesteś. \n\nCo robisz?");

        gs.button1.setText("Wracam się do ścieżki");
        gs.button2.setText("idę dalej w las");

        nextPosition1 = "ścieżka";
        nextPosition2 = "śmierć_głód";

    }

    public void obozowisko(){

        gs.image.setImageResource(R.drawable.forestcamp);
        gs.text.setText("Po kilkunastu kilometrach leśnej ścieżki widzisz w oddali nieduże obozowisko a przy nim kilka mężczyzn \n\nCo robisz?");

        gs.button1.setText("Podchodzę");
        gs.button2.setText("Omijam szerokim łukiem");

        nextPosition1 = "spotkanie";
        nextPosition2 = "karczma";

    }

    public void spotkanie(){

        gs.image.setImageResource(R.drawable.confrontation);
        gs.text.setText("Widzisz że mężczyzni nie nalężą do tych bardziej przyjaznych. \n\nCo robisz?");

        gs.button1.setText("Próbujesz ich przekonać do pomocy");
        gs.button2.setText("Oferujesz im kilka złotych monet z twojej sakiewki(Jeśli masz) w zamian za pomoc.");

        nextPosition1 = "śmierć_las";
        nextPosition2 = "KoniecLasu_Podwózka";

    }

    public void karczma() {

        gs.image.setImageResource(R.drawable.tavernsign);
        gs.text.setText("Po przejściu kolejnych kilku kilometrów natrafiasz na karczmę. \n\nCo robisz?");

        gs.button1.setText("idę dalej ścieżką");
        gs.button2.setText("Wchodzę i pytam karczmarza o drogę do miasta");

        nextPosition1 = "rozwidlenie";
        nextPosition2 = "karczmarz";
    }

    public void karczmarz() {

        gs.image.setImageResource(R.drawable.suspicious);
        gs.text.setText("Mężczyzna za ladą zorientował się że jesteś zbiegiem z więzienia, ale zgodził się ci pomóc za drobną przysługę. \n\nCo robisz?");

        gs.button1.setText("Olewasz go i wychodzę");
        gs.button2.setText("Wręczasz kilka monet(Jeśli masz)");

        nextPosition1 = "śmierć_piwnica";
        nextPosition2 = "wskazówka";
    }

    public void wskazówka() {

        gs.image.setImageResource(R.drawable.sideswipe);
        gs.text.setText("Dowiadujesz się, że na rozwidleniu, aby dotrzeć do miasta, musisz skręcić w lewo. \n\nCo robisz?");

        gs.button1.setText("");
        gs.button1.setVisibility(View.INVISIBLE);
        gs.button2.setText("Dziękuję Karczmarzowi i wychodzęz budynku)");

        nextPosition1 = "";
        nextPosition2 = "rozwidlenie";
    }

    public void rozwidlenie() {

        gs.image.setImageResource(R.drawable.crossroad);
        gs.text.setText("Natrafiasz na rozwidlenie. \n\nCo robisz?");

        gs.button1.setText("Ide w lewo");
        gs.button2.setText("Idę w prawo");

        nextPosition1 = "KoniecLasu";
        nextPosition2 = "śmierć_strażnica";
    }

    public void KoniecLasu() {

        gs.image.setImageResource(R.drawable.medievalgate);
        gs.text.setText("Gratulacje! Udało Ci się wydostać z lasu. Przed twoimi oczami rysują się ogromne mury wielkiego i nowoczesnego miasta... \n\nCDN...?");

        gs.button1.setText("");
        gs.button1.setVisibility(View.INVISIBLE);
        gs.button2.setText("Zagraj jeszcze raz!");

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }

    public void KoniecLasu_Podwózka() {

        gs.image.setImageResource(R.drawable.medievalgate);
        gs.text.setText("Gratulacje! Udało Ci się wydostać z lasu. Mężczyźni podwożą cię od razu poza puszczę. Przed twoimi oczami rysują się ogromne mury wielkiego i nowoczesnego miasta... \n\nCDN...?");

        gs.button1.setText("");
        gs.button1.setVisibility(View.INVISIBLE);
        gs.button2.setText("Zagraj jeszcze raz!");

        nextPosition1 = "";
        nextPosition2 = "StartingPoint";
    }
}


