
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class AddResponse implements Serializable
{

    private static final long serialVersionUID = -3660616051862595459L;

    private String _index;
    private String _type;
    private String _id;
    private String _version;
    private String result;
    private String created;
    private Shards _shards;

    public String get_index()
    {
        return _index;
    }

    public void set_index( String _index )
    {
        this._index = _index;
    }

    public String get_type()
    {
        return _type;
    }

    public void set_type( String _type )
    {
        this._type = _type;
    }

    public String get_id()
    {
        return _id;
    }

    public void set_id( String _id )
    {
        this._id = _id;
    }

    public String get_version()
    {
        return _version;
    }

    public void set_version( String _version )
    {
        this._version = _version;
    }

    public String getResult()
    {
        return result;
    }

    public void setResult( String result )
    {
        this.result = result;
    }

    public String getCreated()
    {
        return created;
    }

    public void setCreated( String created )
    {
        this.created = created;
    }

    public Shards get_shards()
    {
        return _shards;
    }

    public void set_shards( Shards _shards )
    {
        this._shards = _shards;
    }

}
