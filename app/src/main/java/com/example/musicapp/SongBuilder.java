package com.example.musicapp;

public class SongBuilder {
    public String rapsong;
    public String[] rapverse;
    public String[] rapverse2;
    public String[] rapchorus;
    public String[] rapbridge;
    public String rocksong;
    public String[] rockverse;
    public String[] rockverse2;
    public String[] rockchorus;
    public String[] rockbridge;
    public String randbsong;
    public String[] randbverse;
    public String[] randbverse2;
    public String[] randbchorus;
    public String[] randbbridge;
    public String countrysong;
    public String[] countryverse;
    public String[] countryverse2;
    public String[] countrychorus;
    public String[] countrybridge;

    public void CreatingRapVerse1() {
        int randomchorus = (int) (Math.random() * 2) + 1;
        rapverse = new String[7];
        rapverse2 = new String[7];
        rapbridge = new String[3];
        rapchorus = new String[5];
        String bridgebunch = "The sun is shinin' today\n" +
                "The sun is shinin' today\n" +
                "Here it is man, I told y'all\n" +
                "Feels like summer in the winter\n" +
                "No matter what it always feels like summer in the neighborhood\n" +
                "And being that it feels like summer, let's do this man\n" +
                "Whatever day, vibe, month it is, it just feels like summer\n" +
                "You know what I'm saying?\n" +
                "Now you a dead man for real\n" +
                "Nobody mention my familia\n" +
                "I'ma show 'em how to act\n" +
                "I'ma show you, show you, show you, show you\n" +
                "I'ma show 'em how to act\n" +
                "Hard labor let me pay the price\n" +
                "I think I need to let it loose\n" +
                "Ooh love ya baby oh oh\n" +
                "Love ya baby oh yeah";

        String chorusbunch = "But not the kinda love that will be in vain\n" +
                "I wanna love, love you foreverGirl of my dreams, I wanna hold her\n" +
                "Share my life and love you, do everything\n" +
                "You got to make sure you can love somebody\n" +
                "And no woman that I know loves me this wayLove is love God is God\n" +
                "It always comes as no surprise\n" +
                "Love never lets you goSometimes you make me think. I love you\n" +
                "Sometimes you make me sing\n" +
                "Love makes the world go around, make a world go around\nCause I love dem\n" +
                "But I love dem\n" +
                "Where is the love? Where is love?And no woman that I know loves me this way\n" +
                "But I know some people that they really love me\n" +
                "I love everybody with their arm around them";

        String chorusbunch2 = "Or I live another day\n" +
                "With my head against the world\n" +
                "And my heart to the grind\n" +
                "I grind hard, grind, grind hard, grind hard, grind hard\n" +
                "Hey yeah, we be on the grind\n" +
                "This too will give you a rush\n" +
                "I want ya brain and this too, put it behind me\n" +
                "Imma a grind, imma a grind, imma a grind\n" +
                "Baby girl, give it to me now\n" +
                "Bumping and grinding with the top turned\n" +
                "Both my stick fingers right up she know I grind daily\n" +
                "In the hood on the grind, nothing aint goin so good";

        String versebunch = "Straight out the pointy dungeons of rap.\n" +
                "The angel drops deep as does my money.\n" +
                "I never smile, 'cause to smile is the son of blini.\n" +
                "Beyond the walls of arms, life is defined.\n" +
                "I think of muppets when I'm in a Prague state of mind.\n" +
                "Hope the trick got some stick.\n" +
                "My sic don't like no dirty dick.\n" +
                "Run up to the tick and get the kick.\n" +
                "In a Prague state of mind.\n" +
                "What more could you ask for? The moist angel?\n" +
                "You complain about famine.\n" +
                "I gotta love it though - somebody still speaks for the black archangel.\n" +
                "I'm rappin' to the cat.\n" +
                "And I'm gonna move your a.\n" +
                "Chewy, great, rancid, like a joystick\n" +
                "Boy, I tell you, I thought you were a sic.\n" +
                "I can't take the famine, can't take the apple.\n" +
                "I woulda tried to sleep I guess I got no dapple.\n" +
                "I'm rappin' to the streets.\n" +
                "And I'm gonna move your cat.\n" +
                "Yea, yaz, in a Prague state of mind.\n" +
                "When I was young my son had a honey.\n" +
                "I waz kicked out without no blini.\n" +
                "I never thought I'd see that sunny.\n" +
                "Ain't a soul alive that could take my son's gunny.\n" +
                "A little banana is quite the americana.\n" +
                "Thinking of muppets. Yaz, thinking of muppets.\n" +
                "The snail drops deep as does my heart.\n" +
                "I never tickle, 'cause to tickle is the husband of start.\n" +
                "Beyond the walls of shoes, life is defined.\n" +
                "I think of cheese when I'm in a Washington state of mind.\n" +
                "Hope the art got some start.\n" +
                "My smart don't like no dirty part.\n" +
                "Run up to the counterpart and get the chart.\n" +
                "In a Washington state of mind.\n" +
                "What more could you ask for? The pointless snail?\n" +
                "You complain about chickens.\n" +
                "I gotta love it though - somebody still speaks for the trail.\n" +
                "I'm rappin' to the head,\n" +
                "And I'm gonna move your lead.\n" +
                "Wild, mild, crazy, like a shoe\n" +
                "Boy, I tell you, I thought you were an eschew.\n" +
                "I can't take the chickens, can't take the flamingo.\n" +
                "I woulda tried to sing I guess I got no dingo.\n" +
                "I'm rappin' to the lead,\n" +
                "And I'm gonna move your head.\n" +
                "Yea, yaz, in a Washington state of mind.\n" +
                "When I was young my husband had an entail.\n" +
                "I waz kicked out without no scale.\n" +
                "I never thought I'd see that rail.\n" +
                "Ain't a soul alive that could take my husband's hail.\n" +
                "A smooth pineapple is quite the snapple.";
        if(randomchorus == 1);
        {
            String[] chorusparts = chorusbunch.split("\n");
            int min3 = 0;
            int max3 = chorusparts.length - 1;
        for (int j = 0; j < rapchorus.length; j++)
        {
            int randomnum = (int) (Math.random() * (max3 - min3 + 1) + min3);
                rapchorus[j] = chorusparts[randomnum];
        }
        for(int i = 0; i < rapchorus.length; i++)
        {
            rapchorus[i] = rapchorus[i].concat("...");
        }
        }
        if(randomchorus == 2)
        {
            String[] chorusparts2 = chorusbunch2.split("\n");
            int minchourus = 0;
            int maxchourus = chorusparts2.length-1;
            for (int j = 0; j < rapchorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (maxchourus - minchourus + 1) + minchourus);
                rapchorus[j] = chorusparts2[randomnum];
            }
            for(int i = 0; i < rapchorus.length; i++)
            {
                rapchorus[i] = rapchorus[i].concat("...");
            }
        }
        String[] bridgeparts = bridgebunch.split("\n");
        int min2 = 0;
        int max2 = bridgeparts.length - 1;

        for (int j = 0; j < rapbridge.length; j++) {
            int randomnum = (int) (Math.random() * (max2 - min2 + 1) + min2);
                rapbridge[j] = bridgeparts[randomnum];
        }
        for(int i = 0; i < rapbridge.length; i++)
        {
            rapbridge[i] = rapbridge[i].concat("...");
        }

        String[] verseparts = versebunch.split("\n");
        int min = 0;
        int max = verseparts.length - 1;

        for (int j = 0; j < rapverse.length; j++)
        {
            int randomnum = (int) (Math.random() * (max - min + 1) + min);
            int randomnum2 = (int) (Math.random() * (max - min + 1) + min);

                rapverse[j] = verseparts[randomnum];
                rapverse2[j] = verseparts[randomnum2];
        }
        for(int i = 0; i < rapverse.length; i++)
        {
            rapverse[i] = rapverse[i].concat("...");
            rapverse2[i] = rapverse2[i].concat("...");
        }
    }

    public String ReturningRapDisplay() {
        String display = "";
        for (int i = 0; i < rapverse.length; i++) {
            display += rapverse[i].substring(0, rapverse[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rapchorus.length; i++) {
            display += rapchorus[i].substring(0, rapchorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rapverse2.length; i++) {
            display += rapverse2[i].substring(0, rapverse2[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rapchorus.length; i++) {
            display += rapchorus[i].substring(0, rapchorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rapbridge.length; i++) {
            display += rapbridge[i].substring(0, rapbridge[i].length() - 3);
            display += ". ";
        }
        return display;
    }
    public String ReturningRap() {
        for (int i = 0; i < rapverse.length; i++) {
            rapsong += rapverse[i];
        }
        for (int e = 0; e < rapchorus.length; e++) {
            rapsong += rapchorus[e];
        }
        for (int j = 0; j < rapverse2.length; j++) {
            rapsong += rapverse2[j];
        }
        for (int t = 0; t < rapchorus.length; t++) {
            rapsong += rapchorus[t];
        }
        for (int k = 0; k < rapbridge.length; k++) {
            rapsong += rapbridge[k];
        }
        return rapsong;
    }
    public void CreatingRockVerse1()
    {
        int randomchorus = (int) (Math.random() * 2) + 1;
        rockverse = new String[7];
        rockverse2 = new String[7];
        rockbridge = new String[3];
        rockchorus = new String[5];
        String versebunch = "The world is hard, so many are lost\n" +
                "How hard it is just to believe\n" +
                "I said it made me happy\n" +
                "I know it must have been hard\n" +
                "When the wind blows hard\n" +
                "Sometimes I feel just like a thief\n" +
                "Every day I walk this thin line\n" +
                "Hard to keep my cool at nightTell me, am I crazy?\n" +
                "Yeah, you look like trouble\n" +
                "Crazy people coming up with\n" +
                "Strangers trying to break into my heart\n" +
                "Welcome sign, come inside\n" +
                "Where did they take you?\n" +
                "Got your book, here with me\n" +
                "Sounds like a fun day\n" +
                "Well I had a name, I had a number\n" +
                "I had a price, I thought I had hit the bottom\n" +
                "Must have meant nothing to ya\n" +
                "Cause I fall for this every time\n" +
                "And this is my experience\n" +
                "Of love in a distant, lonely world\n" +
                "I see loyalty, when I see you\n" +
                "I see hope when I see you ";

        String chorusbunch = "I made my way by sitting on the cold hard ground\n" +
                "I used to scream like a baby, now I just scream into the night\n" +
                "Well you might be the hardest\n" +
                "With your heart in your hand the hard wayIn it comes, comes and it hits\n" +
                "And it hits hard\n" +
                "Harder than it ever then\n" +
                "Youll even call it\n" +
                "I think I might go crazy, go crazy, go crazy\n" +
                "To really know where I am\n" +
                "Please put her arms around me, around me\n" +
                "She may never give me genuine loveWhich is always the first one to warn you\n" +
                "Things will get pretty crazy you always know the weather well\n" +
                "Nothing to get crazy\n" +
                "That was long time ago\n" +
                "I cry, I cry, no one else can help me please\n" +
                "Lord, I wanna fall, I wanna fall, in love\n" +
                "Peace and love, would you let me know?";
        String chorusbunch2 = "I just came to have a ball\n" +
                "And party with all my friends\n" +
                "A rich man must have a party\n" +
                "Party that lasts a year";

        String bridgebunch = "Where did all your fun go?\n" +
                "Round and around rolling round\n" +
                "Let your party house go up in flames\n" +
                "If we just start today\n" +
                "A place in the past for love\n" +
                "Fly so high, stay so free\n" +
                "Keep that in mind, before we lose this\n" +
                "And I may never get the chance again to";
        if(randomchorus == 1);
        {
            String[] chorusparts = chorusbunch.split("\n");
            int min3 = 0;
            int max3 = chorusparts.length - 1;
            for (int j = 0; j < rockchorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (max3 - min3 + 1) + min3);
                rockchorus[j] = chorusparts[randomnum];
            }
            for(int i = 0; i < rockchorus.length; i++)
            {
                rockchorus[i] = rockchorus[i].concat("...");
            }
        }
        if(randomchorus == 2)
        {
            String[] chorusparts2 = chorusbunch2.split("\n");
            int minchourus = 0;
            int maxchourus = chorusparts2.length-1;
            for (int j = 0; j < rockchorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (maxchourus - minchourus + 1) + minchourus);
                rockchorus[j] = chorusparts2[randomnum];
            }
            for(int i = 0; i < rockchorus.length; i++)
            {
                rockchorus[i] = rockchorus[i].concat("...");
            }
        }
        String[] bridgeparts = bridgebunch.split("\n");
        int min2 = 0;
        int max2 = bridgeparts.length - 1;

        for (int j = 0; j < rockbridge.length; j++) {
            int randomnum = (int) (Math.random() * (max2 - min2 + 1) + min2);
            rockbridge[j] = bridgeparts[randomnum];
        }
        for(int i = 0; i < rockbridge.length; i++)
        {
            rockbridge[i] = rockbridge[i].concat("...");
        }

        String[] verseparts = versebunch.split("\n");
        int min = 0;
        int max = verseparts.length - 1;

        for (int j = 0; j < rockverse.length; j++)
        {
            int randomnum = (int) (Math.random() * (max - min + 1) + min);
            int randomnum2 = (int) (Math.random() * (max - min + 1) + min);

            rockverse[j] = verseparts[randomnum];
            rockverse2[j] = verseparts[randomnum2];
        }
        for(int i = 0; i < rockverse.length; i++)
        {
            rockverse[i] = rockverse[i].concat("...");
            rockverse2[i] = rockverse2[i].concat("...");
        }
    }
    public String ReturningRockDisplay()
    {
        String display = "";
        for (int i = 0; i < rockverse.length; i++) {
            display += rockverse[i].substring(0, rockverse[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rockchorus.length; i++) {
            display += rockchorus[i].substring(0, rockchorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rockverse2.length; i++) {
            display += rockverse2[i].substring(0, rockverse2[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rockchorus.length; i++) {
            display += rockchorus[i].substring(0, rockchorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < rockbridge.length; i++) {
            display += rockbridge[i].substring(0, rockbridge[i].length() - 3);
            display += ". ";
        }
        return display;
    }
    public String ReturningRock()
    {
        for (int i = 0; i < rockverse.length; i++) {
            rocksong += rockverse[i];
        }
        for (int e = 0; e < rockchorus.length; e++) {
            rocksong += rockchorus[e];
        }
        for (int j = 0; j < rockverse2.length; j++) {
            rocksong += rockverse2[j];
        }
        for (int t = 0; t < rockchorus.length; t++) {
            rocksong += rockchorus[t];
        }
        for (int k = 0; k < rockbridge.length; k++) {
            rocksong += rockbridge[k];
        }
        return rocksong;
    }
    public void CreatingRandBVerse1()
    {
        int randomchorus = (int) (Math.random() * 2) + 1;
        randbverse = new String[7];
        randbverse2 = new String[7];
        randbbridge = new String[3];
        randbchorus = new String[5];

        String versebunch = "He said, you do as your heart spins\n" +
                "You gotta love as you live, ya gotta love as you go\n" +
                "Still counting down the days\n" +
                "That you fall in love\n" +
                "This love has left me stranded on the edge of thrills\n" +
                "And this love has left me stuck here in the end\n" +
                "I want a perfect love\n" +
                "Because all I ever needed\n" +
                "Love and fear have filled up my head\n" +
                "Never let me see you walk away\n" +
                "Because your love says I am yours\n" +
                "Without your love I am lost\n" +
                "You gotta go and find it\n" +
                "Toast up the girls in the party\n" +
                "You gotta go and find it\n" +
                "Toast up the girls in the party\n" +
                "You know today I just called to say\n" +
                "Im going away to a certain party\n" +
                "What if I am is all that I want?\n" +
                "What if I is all that you are?\n" +
                "You want to have some fun\n" +
                "Burning your candle slow\n" +
                "So pour me another shot\n" +
                "If you want some fun, some fun, some fun\n" +
                "Cause when it comes to the women\n" +
                "You know better that you do\n" +
                "All I can do is be the better man\n" +
                "And I do it with a feeling that is growing more every day";

        String chorusbunch = "I need a love to share\n" +
                "I need a love of life\n" +
                "I need a love to share\n" +
                "I need a love of life\n" +
                "Move our love from town to town\n" +
                "From hotel to motel\n" +
                "I need you like lost puppy love\n" +
                "Lost puppy love\n" +
                "Have fun, my baby have fun\n" +
                "If you ever had somebody in your life that made you feel\n" +
                "That love was more than just little fun play\n" +
                "Feel it better, feel it better than the rest\n" +
                "Feel it better, ahh you better\n" +
                "Feel it better, feel it better\n" +
                "Baby if you want to leave me just leave me alone\n" +
                "Well you better go now, go somewhere, whatcha gonna do?\n" +
                "You better come now, come on, come up here, whatcha gonna do?\n" +
                "Why are you throwing, throwing, throwing, throwing away our love?\n" +
                "You should be taking, making, giving, taking better\n" +
                "I think we should do this right\n" +
                "Girl you better do this right\n" +
                "If you leave baby you better do this right\n" +
                "If you left baby you better do this right";

        String chorusbunch2 = "Rise to the top, get on the couch, crash the party\n" +
                "Rise to the top, get on the couch, crash the party\n" +
                "I got this party plan for sexy tonight\n" +
                "I got this party planned for you\n" +
                "Sneak in the dark\n" +
                "Dance in the dark\n" +
                "Dance in the dark\n" +
                "Show them you know how\n" +
                "The way you danced, the way you danced\n" +
                "I try to dance to your rhythm\n" +
                "Just the way to make me dance\n" +
                "Please show me how to move my feet\n" +
                "Mountains fall in place, I better run\n" +
                "Mountains fall and break, I belong\n" +
                "Mountains fall and break, I better run\n" +
                "Sun comes and sets, I better run\n" +
                "Makes me feel so much better\n" +
                "So much better, so much better\n" +
                "No better love, just let it be\n" +
                "Comes into my room, all of the time";

        String bridgebunch = "To love you, no trying\n" +
                "To love you, no trying\n" +
                "He said, you do as your heart spins\n" +
                "You gotta love as you live, ya gotta love as you go\n" +
                "In this life I give my soul to see you live\n" +
                "All that I am, let your love fill up my heart\n" +
                "When we love comes calling\n" +
                "There are no hours, no time\n" +
                "All I know is your body belongs to me\n" +
                "Dance with you forever\n" +
                "But I know your heart is hurting\n" +
                "You deserve to know that you did better\n" +
                "I know that you want a better life\n" +
                "But maybe you should be at your best\n" +
                "Open up your eyes and see my face\n" +
                "Baby you better believe me";
        if(randomchorus == 1);
        {
            String[] chorusparts = chorusbunch.split("\n");
            int min3 = 0;
            int max3 = chorusparts.length - 1;
            for (int j = 0; j < randbchorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (max3 - min3 + 1) + min3);
                randbchorus[j] = chorusparts[randomnum];
            }
            for(int i = 0; i < randbchorus.length; i++)
            {
                randbchorus[i] = randbchorus[i].concat("...");
            }
        }
        if(randomchorus == 2)
        {
            String[] chorusparts2 = chorusbunch2.split("\n");
            int minchourus = 0;
            int maxchourus = chorusparts2.length-1;
            for (int j = 0; j < randbchorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (maxchourus - minchourus + 1) + minchourus);
                randbchorus[j] = chorusparts2[randomnum];
            }
            for(int i = 0; i < randbchorus.length; i++)
            {
                randbchorus[i] = randbchorus[i].concat("...");
            }
        }
        String[] bridgeparts = bridgebunch.split("\n");
        int min2 = 0;
        int max2 = bridgeparts.length - 1;

        for (int j = 0; j < randbbridge.length; j++) {
            int randomnum = (int) (Math.random() * (max2 - min2 + 1) + min2);
            randbbridge[j] = bridgeparts[randomnum];
        }
        for(int i = 0; i < randbbridge.length; i++)
        {
            randbbridge[i] = randbbridge[i].concat("...");
        }

        String[] verseparts = versebunch.split("\n");
        int min = 0;
        int max = verseparts.length - 1;

        for (int j = 0; j < randbverse.length; j++)
        {
            int randomnum = (int) (Math.random() * (max - min + 1) + min);
            int randomnum2 = (int) (Math.random() * (max - min + 1) + min);

            randbverse[j] = verseparts[randomnum];
            randbverse2[j] = verseparts[randomnum2];
        }
        for(int i = 0; i < randbverse.length; i++)
        {
            randbverse[i] = randbverse[i].concat("...");
            randbverse2[i] = randbverse2[i].concat("...");
        }
    }
    public String ReturningRandBDisplay()
    {
        String display = "";
        for (int i = 0; i < randbverse.length; i++) {
            display += randbverse[i].substring(0, randbverse[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < randbchorus.length; i++) {
            display += randbchorus[i].substring(0, randbchorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < randbverse2.length; i++) {
            display += randbverse2[i].substring(0, randbverse2[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < randbchorus.length; i++) {
            display += randbchorus[i].substring(0, randbchorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < randbbridge.length; i++) {
            display += randbbridge[i].substring(0, randbbridge[i].length() - 3);
            display += ". ";
        }
        return display;
    }
    public String ReturningRandB()
    {
        for (int i = 0; i < randbverse.length; i++) {
            randbsong += randbverse[i];
        }
        for (int e = 0; e < randbchorus.length; e++) {
            randbsong += randbchorus[e];
        }
        for (int j = 0; j < randbverse2.length; j++) {
            randbsong += randbverse2[j];
        }
        for (int t = 0; t < randbchorus.length; t++) {
            randbsong += randbchorus[t];
        }
        for (int k = 0; k < randbbridge.length; k++) {
            randbsong += randbbridge[k];
        }
        return randbsong;
    }
    public void CreatingCountryVerse1()
    {
        int randomchorus = (int) (Math.random() * 2) + 1;
        countryverse = new String[7];
        countryverse2 = new String[7];
        countrybridge = new String[3];
        countrychorus = new String[5];

        String versebunch = "";

        String chorusbunch = "";

        String chorusbunch2 = "";

        String bridgebunch = "";

        if(randomchorus == 1);
        {
            String[] chorusparts = chorusbunch.split("\n");
            int min3 = 0;
            int max3 = chorusparts.length - 1;
            for (int j = 0; j < countrychorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (max3 - min3 + 1) + min3);
                countrychorus[j] = chorusparts[randomnum].concat(".");
            }
            for(int i = 0; i < countrychorus.length; i++)
            {
                countrychorus[i] = countrychorus[i].concat("...");
            }
        }
        if(randomchorus == 2)
        {
            String[] chorusparts2 = chorusbunch2.split("\n");
            int minchourus = 0;
            int maxchourus = chorusparts2.length-1;
            for (int j = 0; j < countrychorus.length; j++)
            {
                int randomnum = (int) (Math.random() * (maxchourus - minchourus + 1) + minchourus);
                countrychorus[j] = chorusparts2[randomnum].concat(".");
            }
            for(int i = 0; i < countrychorus.length; i++)
            {
                countrychorus[i] = countrychorus[i].concat("...");
            }
        }
        String[] bridgeparts = bridgebunch.split("\n");
        int min2 = 0;
        int max2 = bridgeparts.length - 1;

        for (int j = 0; j < countrybridge.length; j++) {
            int randomnum = (int) (Math.random() * (max2 - min2 + 1) + min2);
            countrybridge[j] = bridgeparts[randomnum];
        }
        for(int i = 0; i < countrybridge.length; i++)
        {
            countrybridge[i] = countrybridge[i].concat("...");
        }

        String[] verseparts = versebunch.split("\n");
        int min = 0;
        int max = verseparts.length - 1;

        for (int j = 0; j < countryverse.length; j++)
        {
            int randomnum = (int) (Math.random() * (max - min + 1) + min);
            int randomnum2 = (int) (Math.random() * (max - min + 1) + min);

            countryverse[j] = verseparts[randomnum];
            countryverse2[j] = verseparts[randomnum2];
        }
        for(int i = 0; i < countryverse.length; i++)
        {
            countryverse[i] = countryverse[i].concat("...");
            countryverse2[i] = countryverse2[i].concat("...");
        }
    }
    public String ReturningCountryDisplay()
    {
        String display = "";
        for (int i = 0; i < countryverse.length; i++) {
            display += countryverse[i].substring(0, countryverse[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < countrychorus.length; i++) {
            display += countrychorus[i].substring(0, countrychorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < countryverse2.length; i++) {
            display += countryverse2[i].substring(0, countryverse2[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < countrychorus.length; i++) {
            display += countrychorus[i].substring(0, countrychorus[i].length() - 3);
            display += ". ";
        }
        display += "\n\n";

        for (int i = 0; i < countrybridge.length; i++) {
            display += countrybridge[i].substring(0, countrybridge[i].length() - 3);
            display += ". ";
        }
        return display;
    }
    public String ReturningCountry()
    {
        for (int i = 0; i < countryverse.length; i++) {
            countrysong += countryverse[i];
        }
        for (int e = 0; e < countrychorus.length; e++) {
            countrysong += countrychorus[e];
        }
        for (int j = 0; j < countryverse2.length; j++) {
            countrysong += countryverse2[j];
        }
        for (int t = 0; t < countrychorus.length; t++) {
            countrysong += countrychorus[t];
        }
        for (int k = 0; k < countrybridge.length; k++) {
            countrysong += countrybridge[k];
        }
        return countrysong;
    }
}
