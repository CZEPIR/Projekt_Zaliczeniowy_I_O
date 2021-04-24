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
            case "Win": Win();break;
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
        gs.text.setText("Gratulacje! W szafce znalazłeś klucze oraz nóż. \n\nCo robisz?");

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
        nextPosition2 = "Win";

    }

    public void Win(){

        gs.image.setImageResource(R.drawable.evasion);
        gs.text.setText("BRAWO! Udało Ci się ucieć z więzienia! Teraz tylko pozostaje pytanie. Dlaczego tam trafiłeś? \n\nCDN...");

        gs.button1.setText("");
        gs.button1.setVisibility(View.INVISIBLE);
        gs.button2.setText("Zagraj jeszcze raz");


        nextPosition1 = "";
        nextPosition2 = "StartingPoint";

    }

}
