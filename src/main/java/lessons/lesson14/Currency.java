package lessons.lesson14;

public enum Currency implements Size{
    UAN("ukraine", 980){
            @Override
    public int getWidth() {
        return 100;
    }

    @Override
    public int getHeight() {
        return 20;
    }
    },
    USD("usa", 840){
        @Override
        public int getWidth() {
            return 120;
        }

        @Override
        public int getHeight() {
            return 25;
        }
    },
    EUR ("germany", 978)
            {
                @Override
                public int getWidth() {
                    return 150;
                }
                @Override
                public int getHeight() {
                    return 20;
                }
            };

    private final String country;
    private final int curCode;
//    private final int curWidth;
//    private final int curHeight;

    Currency(String country, int curCore) {
        this.country = country;
        this.curCode = curCore;
//        this.curWidth = width;
//        this.curHeight = height;
    }


    public String getCountry() {
        return country;
    }

    public int getCurCode() {
        return curCode;
    }



    @Override
    public String toString() {
        return this.name() +
                " / " + country +
                " / " + curCode;
    }

//    @Override
//    public int getWidth() {
//        return curWidth;
//    }
//
//    @Override
//    public int getHeight() {
//        return curHeight;
//    }
}
