
package Model;

import Entities.Flights;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Shubham
 */
@Stateless
@LocalBean
public class Scheduling{
     
    public Map<Integer, List<Flights>> storeDayWise(List<Flights> list) {
        int nof=0,rem,div;
        List<Flights> sun=new ArrayList<Flights>();
        List<Flights> mon=new ArrayList<Flights>();
        List<Flights> tue=new ArrayList<Flights>();
        List<Flights> wed=new ArrayList<Flights>();
        List<Flights> thu=new ArrayList<Flights>();
        List<Flights> fri=new ArrayList<Flights>();
        List<Flights> sat=new ArrayList<Flights>();
        
        for(int i=0;i<list.size();i++)
        {
            nof=list.get(i).getNumFlights();
            div=nof/7;
            rem=nof%7;
            
            if((rem==0) || (nof==0))
            {
                for(int j=0;j<div;j++)
                {
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    tue.add(list.get(i));
                    wed.add(list.get(i));
                    thu.add(list.get(i));
                    fri.add(list.get(i));
                    sat.add(list.get(i));
                    
                }
            }
            
            else if(nof<7)
            {
                if(rem==1) 
                {
                    sun.add(list.get(i));
                }
                else if(rem==2)
                {
                    sun.add(list.get(i));
                    wed.add(list.get(i));
                }
                 else if(rem==3)
                {
                    sun.add(list.get(i));
                    tue.add(list.get(i));
                    fri.add(list.get(i));
                }
                 else if(rem==4)
                {
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    wed.add(list.get(i));
                    fri.add(list.get(i));
                }
                 else if(rem==5)
                {
                    sat.add(list.get(i));
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    wed.add(list.get(i));
                    fri.add(list.get(i));
                }
                 else if(rem==6)
                {
                    sat.add(list.get(i));
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    wed.add(list.get(i));
                    thu.add(list.get(i));
                    fri.add(list.get(i));
                }
                 
            }
            else if((nof>7)&&(rem!=0))
            {
                for(int j=0;j<div;j++)
                {
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    tue.add(list.get(i));
                    wed.add(list.get(i));
                    thu.add(list.get(i));
                    fri.add(list.get(i));
                    sat.add(list.get(i));
                    
                }
                 if(rem==1) 
                {
                    sun.add(list.get(i));
                }
                else if(rem==2)
                {
                    sun.add(list.get(i));
                    wed.add(list.get(i));
                }
                 else if(rem==3)
                {
                    sun.add(list.get(i));
                    tue.add(list.get(i));
                    fri.add(list.get(i));
                }
                 else if(rem==4)
                {
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    wed.add(list.get(i));
                    fri.add(list.get(i));
                }
                 else if(rem==5)
                {
                    sat.add(list.get(i));
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    wed.add(list.get(i));
                    fri.add(list.get(i));
                }
                 else if(rem==6)
                {
                    sat.add(list.get(i));
                    sun.add(list.get(i));
                    mon.add(list.get(i));
                    wed.add(list.get(i));
                    thu.add(list.get(i));
                    fri.add(list.get(i));
                }
            
            }
           
        }
        Map<Integer, List<Flights>> data = new TreeMap<Integer, List<Flights>>();
        for(int i=0;i<7;i++)
        {
            data.put(1,mon);//mon
            data.put(2,tue);
            data.put(3,wed);
            data.put(4,thu);
            data.put(5,fri);
            data.put(6,sat);
            data.put(7,sun);
            
            
        }
        return data;
    }
    
    
    
    public TreeMap<Flights,Integer>  countSame(List<Flights> data)
    {
        TreeMap<Flights,Integer> m=new TreeMap<Flights,Integer>();
        int cnt=0,value=0;
        for(int i=0;i<data.size();i++)
        {
            cnt=0;
            String dest=data.get(i).getDestinationcity();
            if(m.isEmpty())
            {
                m.put(data.get(i), cnt+1);
            }
            else 
            {
                value=0;
                
                for(int j=0;j<m.size();j++)
                {
                    Flights f=(Flights) m.keySet().toArray()[j];
                    value=m.get(f);
                    
                    if(f.getDestinationcity().equals(dest))
                    {
                        value=value+1;
                        
                    }   
                }
               m.put(data.get(i), value);
            }
        }
        return m;
    }
    
   
}
