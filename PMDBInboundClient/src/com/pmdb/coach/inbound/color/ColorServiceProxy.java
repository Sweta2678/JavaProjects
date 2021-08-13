package com.pmdb.coach.inbound.color;

public class ColorServiceProxy implements com.pmdb.coach.inbound.color.ColorService {
  private String _endpoint = null;
  private com.pmdb.coach.inbound.color.ColorService colorService = null;
  
  public ColorServiceProxy() {
    _initColorServiceProxy();
  }
  
  public ColorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initColorServiceProxy();
  }
  
  private void _initColorServiceProxy() {
    try {
      colorService = (new com.pmdb.coach.inbound.color.ColorServiceServiceLocator()).getColorService();
      if (colorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)colorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)colorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (colorService != null)
      ((javax.xml.rpc.Stub)colorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pmdb.coach.inbound.color.ColorService getColorService() {
    if (colorService == null)
      _initColorServiceProxy();
    return colorService;
  }
  
  public com.pmdb.coach.inbound.color.ColorResponse processColorInPMDB(com.pmdb.coach.inbound.color.ColorRequest colorRequest) throws java.rmi.RemoteException{
    if (colorService == null)
      _initColorServiceProxy();
    return colorService.processColorInPMDB(colorRequest);
  }
  
  
}