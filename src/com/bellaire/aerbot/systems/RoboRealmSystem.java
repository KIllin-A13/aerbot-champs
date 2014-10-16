package com.bellaire.aerbot.systems;

import com.bellaire.aerbot.Environment;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.tables.ITable;
import edu.wpi.first.wpilibj.tables.ITableListener;

public class RoboRealmSystem implements RobotSystem, ITableListener {
    
    private NetworkTable nt;
    
    /**
     * Nothing is done in this constructor
     */
    public RoboRealmSystem() {
        
    }

    /* (non-Javadoc)
     * @see com.bellaire.aerbot.systems.RobotSystem#init(com.bellaire.aerbot.Environment)
     */
    public void init(Environment environment) {
        nt = NetworkTable.getTable("VisionTable");
        nt.addTableListener(this);
    }

    /* (non-Javadoc)
     * @see com.bellaire.aerbot.systems.RobotSystem#destroy()
     */
    public void destroy() {
        
    }

    /* (non-Javadoc)
     * @see edu.wpi.first.wpilibj.tables.ITableListener#valueChanged(edu.wpi.first.wpilibj.tables.ITable, java.lang.String, java.lang.Object, boolean)
     */
    public void valueChanged(ITable itable, String key, Object obj, boolean isNew) {
        SmartDashboard.putString(key, obj.toString());
    }
    
}