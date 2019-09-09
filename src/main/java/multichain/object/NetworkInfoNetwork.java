/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.object;

/**
 * @author Ub - H. MARTEAU
 * @version 2.0.1
 */
public class NetworkInfoNetwork {
  String name = null;
  Long limited = null;
  Long reachable = null;
  String proxy = null;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the limited
   */
  public Long getLimited() {
    return limited;
  }

  /**
   * @param limited the limited to set
   */
  public void setLimited(Long limited) {
    this.limited = limited;
  }

  /**
   * @return the reachable
   */
  public Long getReachable() {
    return reachable;
  }

  /**
   * @param reachable the reachable to set
   */
  public void setReachable(Long reachable) {
    this.reachable = reachable;
  }

  /**
   * @return the proxy
   */
  public String getProxy() {
    return proxy;
  }

  /**
   * @param proxy the proxy to set
   */
  public void setProxy(String proxy) {
    this.proxy = proxy;
  }


}
