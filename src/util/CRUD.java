/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Map;

/**
 *
 * @author evson
 * @param <K>
 * @param <V>
 */
public interface CRUD<K, V> {
    public void create(V crud);
    public Map<K, V> read(V crud);
    public void update(V crud);
    public void delete(V crud);
}
