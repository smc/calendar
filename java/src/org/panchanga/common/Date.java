 

package org.panchanga.common;

import org.panchanga.common.exception.BogusDateException;


// Referenced classes of package calendrica:
//            ProtoDate, BogusDateException

public abstract class Date extends ProtoDate
{

    public Date()
    {
    }

    public Date(int date)
    {
        super(date);
    }

    public Date(Date date)
        throws BogusDateException
    {
        super(date);
    }

    public abstract int toFixed()
        throws BogusDateException;

    public void convertTo(ProtoDate toDate)
        throws BogusDateException
    {
        ProtoDate.convert(this, toDate);
    }
}


