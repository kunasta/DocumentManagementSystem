/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.so;

import com.documentsystem.model.Positions;
import java.util.List;

/**
 *
 * @author Asus
 */
public class SOGetPositionList extends OpstaSO{
    Positions p;
    List<Positions> lp;
    
    @Override
    protected void izvrsiOperaciju() throws Exception {
      lp = db.getPositionList();
    }
    public List<Positions> getPositionList(){
    return lp;
    }
}
