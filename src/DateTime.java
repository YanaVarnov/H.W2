public class DateTime extends Date {
    private int hour;
    private int minute;


    public DateTime(int year, int month, int day, int hour, int minute) {
        super(year, month, day);

        if (hour < 0 || hour > 23)
            this.hour = 0;
        else
            this.hour = hour;
        if (minute < 0 || minute > 59)
            this.minute = 0;
        else
            this.minute = minute;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof DateTime))
            return false;
        else {
            DateTime other = (DateTime)object;
            boolean dateData = super.equals(object);
            return this.hour == other.hour && this.minute == other.minute && (dateData);
        }
    }
    @Override
    public int hashCode(){
        return 60 * hour + minute;
    }

    @Override
    public String toString(){
        String dataTime = super.toString();

        if(this.hour < 10)
            dataTime += "0" + this.hour + ":";
        else
            dataTime += this.hour + ":";

        if(this.minute < 10)
            dataTime += "0" + this.minute + ":";
        else
            dataTime += this.minute + ":";

        return dataTime;
    }


}
