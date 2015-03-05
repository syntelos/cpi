/*
 * Cognitive Profile Inventory Online
 * Copyright (C) 2009 John Pritchard
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package cpi;

import gap.hapax.TemplateName;

/**
 * This file is automatically generated by the build scripts.  
 * @since 1.1
 */
public final class Version
    extends Object
    implements gap.service.Application.Version
{
    /**
     * Major version number.
     */
    public final static int Major = 3;
    /**
     * Minor version number.
     */
    public final static int Minor = 2;
    /**
     * HTTP Product Token in <code>" Major '.' Minor "</code>.
     */
    public final static java.lang.String Short = Major+"."+Minor;
    /**
     * Build sequence number.
     */
    public final static int Build = 1;

    /**
     * HTTP Product Token plus comment build date and time.  
     * As in <code>" Major '.' Minor '.' Build "</code>.
     */
    public final static java.lang.String Long = Short+'.'+Build;

    public final static java.lang.String Name = "cpi";

    public final static java.lang.String Target = "cognitiveprofile";

    public final static boolean IsTest = (Target.contains("-test"));

    public final static boolean IsProd = (!IsTest);

    public final static java.lang.String StringLong = (Name+'/'+Long);

    public final static java.lang.String StringShort = (Name+'/'+Short);


    private final static lxl.Index<String> Index = new lxl.Index<String>();
    static {
        Index.put("long",0);
        Index.put("short",1);
        Index.put("number",2);
        Index.put("name",3);
        Index.put("target",4);
    }
    public final static boolean HasVariable(TemplateName name){
        if (name.is(0))
            return (-1 < name.indexOf(Index));
        else
            return false;
    }
    public final static String GetVariable(TemplateName name){
        if (name.is(0)){
            switch(name.indexOf(Index)){
            case 0:
                return Version.Long;
            case 1:
                return Version.Short;
            case 2:
                return Version.Short;
            case 3:
                return Version.Name;
            case 4:
                return Version.Target;
            default:
                return null;
            }
        }
        else
            return null;
    }



    public Version(){
        super();
    }


    public String getVersionName(){
        return Version.Name;
    }
    public int getVersionMajor(){
        return Version.Major;
    }
    public int getVersionMinor(){
        return Version.Minor;
    }
    public int getVersionBuild(){
        return Version.Build;
    }
    public String getVersionString(){
        return Version.StringLong;
    }
    public int hashCode(){
        return Version.StringLong.hashCode();
    }
    public boolean equals(Object that){
        if (this == that)
            return true;
        else if (null == that)
            return false;
        else
            return Version.StringLong.equals(that.toString());
    }
    public String toString(){
        return Version.StringLong;
    }
}
