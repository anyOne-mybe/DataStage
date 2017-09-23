
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class HitContent<T> implements Serializable
{
    private static final long serialVersionUID = 561854213653771908L;

    private String _index;
    private String _type;
    private String _id;
    private int _score;
    private T _source;

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

    public int get_score()
    {
        return _score;
    }

    public void set_score( int _score )
    {
        this._score = _score;
    }

    public T get_source()
    {
        return _source;
    }

    public void set_source( T _source )
    {
        this._source = _source;
    }

}
