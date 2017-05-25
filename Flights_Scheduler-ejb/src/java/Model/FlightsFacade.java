/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Entities.Flights;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Shubham
 */
@Stateless
public class FlightsFacade extends AbstractFacade<Flights> {
    @PersistenceContext(unitName = "Flights_Scheduler-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FlightsFacade() {
        super(Flights.class);
    }

   /* 
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
    */
    
    
    
}
