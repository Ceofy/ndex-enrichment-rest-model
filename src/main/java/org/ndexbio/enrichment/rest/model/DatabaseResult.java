/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;

import java.util.List;

/**
 *
 * @author churas
 */
public class DatabaseResult {
    private String _uuid;
    private String _description;
    private String _name;
    private String _numberOfNetworks;
    private String _imageURL;
    private List<Network> _networks;
    private String _url;
    
    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String _uuid) {
        this._uuid = _uuid;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public List<Network> getNetworks() {
        return _networks;
    }

    public void setNetworks(List<Network> _networks) {
        this._networks = _networks;
    }

    public String getImageURL() {
        return _imageURL;
    }

    public void setImageURL(String _imageURL) {
        this._imageURL = _imageURL;
    }
    
    public String getUrl() {
    	return _url;
    }
    
    public void setUrl(String _url) {
    	this._url = _url;
    }
    
    public String getNumberOfNetworks() {
    	return _numberOfNetworks;
    }
    
    public void setNumberOfNetworks(String _numberOfNetworks) {
    	this._numberOfNetworks = _numberOfNetworks;
    }
}
