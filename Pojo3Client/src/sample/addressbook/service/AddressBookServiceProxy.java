package sample.addressbook.service;

public class AddressBookServiceProxy implements sample.addressbook.service.AddressBookService {
  private String _endpoint = null;
  private sample.addressbook.service.AddressBookService addressBookService = null;
  
  public AddressBookServiceProxy() {
    _initAddressBookServiceProxy();
  }
  
  public AddressBookServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddressBookServiceProxy();
  }
  
  private void _initAddressBookServiceProxy() {
    try {
      addressBookService = (new sample.addressbook.service.AddressBookServiceServiceLocator()).getAddressBookService();
      if (addressBookService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addressBookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addressBookService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addressBookService != null)
      ((javax.xml.rpc.Stub)addressBookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public sample.addressbook.service.AddressBookService getAddressBookService() {
    if (addressBookService == null)
      _initAddressBookServiceProxy();
    return addressBookService;
  }
  
  public void addEntry(sample.addressbook.entry.Entry entry) throws java.rmi.RemoteException{
    if (addressBookService == null)
      _initAddressBookServiceProxy();
    addressBookService.addEntry(entry);
  }
  
  public sample.addressbook.entry.Entry findEntry(java.lang.String name) throws java.rmi.RemoteException{
    if (addressBookService == null)
      _initAddressBookServiceProxy();
    return addressBookService.findEntry(name);
  }
  
  
}