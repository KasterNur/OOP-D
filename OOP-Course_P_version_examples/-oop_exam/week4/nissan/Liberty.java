package week4.nissan;

import week4.Nissan;
import week4.Transport;

public class Liberty extends Nissan {
    
    public void hasMultiSeat()
    {
        System.out.println("Liberty has 6 seats");
    }

    @Override
    public boolean equals(Object obj) {
        Transport t = (Transport)obj;

        if(this.getId()==t.getId())
        {
            return true;
        }
        return false;
    }
}
