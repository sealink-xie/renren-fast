package io.renren.modules.weidian.sdk.request.product;

import io.renren.modules.weidian.sdk.exception.OpenException;
import io.renren.modules.weidian.sdk.request.AbstractRequest;
import io.renren.modules.weidian.sdk.response.product.CommonItemResponse;
import io.renren.modules.weidian.sdk.util.JsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取单个商品<br/>
 * <a href="http://wiki.open.weidian.com/index.php?title=%E8%8E%B7%E5%8F%96%E5%8D%95%E4%B8%AA%E5%95%86%E5%93%81">查看接口文档</a>
 * */
public class VdianItemGetRequest extends AbstractRequest<CommonItemResponse> {

  private String itemId;

  public VdianItemGetRequest(String accessToken, String itemId) {
    super(accessToken);
    this.itemId = itemId;
  }

  @Override
  public String getParam() throws OpenException {
    Map<String, Object> map = new HashMap<String, Object>((int) (1 / .75f) + 1);
    map.put("itemid", this.itemId);
    return JsonUtils.toJson(map);
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

}
