package com.ctrip.framework.apollo.common.config;

import org.springframework.core.env.MapPropertySource;

import java.util.Map;


/**
 * MapPropertySourced是propertySourced的实现类，目的是自定义配置数据源
 */
public abstract class RefreshablePropertySource extends MapPropertySource {


  public RefreshablePropertySource(String name, Map<String, Object> source) {
    super(name, source);
  }

  @Override
  public Object getProperty(String name) {
    return this.source.get(name);
  }

  /**
   * refresh property
   */
  protected abstract void refresh();

}
