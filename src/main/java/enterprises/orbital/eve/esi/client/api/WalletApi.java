/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.6.dev12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package enterprises.orbital.eve.esi.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import enterprises.orbital.eve.esi.client.invoker.ApiCallback;
import enterprises.orbital.eve.esi.client.invoker.ApiClient;
import enterprises.orbital.eve.esi.client.invoker.ApiException;
import enterprises.orbital.eve.esi.client.invoker.ApiResponse;
import enterprises.orbital.eve.esi.client.invoker.Configuration;
import enterprises.orbital.eve.esi.client.invoker.Pair;
import enterprises.orbital.eve.esi.client.invoker.ProgressRequestBody;
import enterprises.orbital.eve.esi.client.invoker.ProgressResponseBody;
import enterprises.orbital.eve.esi.client.model.GetCharactersCharacterIdWallets200Ok;

public class WalletApi {
  private ApiClient apiClient;

  public WalletApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WalletApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(
                           ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for getCharactersCharacterIdWallets */
  private com.squareup.okhttp.Call getCharactersCharacterIdWalletsCall(
                                                                       Integer characterId,
                                                                       String datasource,
                                                                       final ProgressResponseBody.ProgressListener progressListener,
                                                                       final ProgressRequestBody.ProgressRequestListener progressRequestListener)
    throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'characterId' is set
    if (characterId == null) { throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdWallets(Async)"); }

    // create path and map variables
    String localVarPath = "/characters/{character_id}/wallets/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",
                                                                                                              apiClient.escapeString(characterId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (datasource != null) localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
        @Override
        public com.squareup.okhttp.Response intercept(
                                                      com.squareup.okhttp.Interceptor.Chain chain)
          throws IOException {
          com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
          return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {
        "evesso"
    };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
                               progressRequestListener);
  }

  /**
   * List wallets and balances List your wallets and their balances. Characters typically have only one wallet, with wallet_id 1000 being the master wallet. ---
   * Alternate route: &#x60;/v1/characters/{character_id}/wallets/&#x60; Alternate route: &#x60;/legacy/characters/{character_id}/wallets/&#x60; Alternate
   * route: &#x60;/dev/characters/{character_id}/wallets/&#x60; --- This route is cached for up to 120 seconds
   * 
   * @param characterId
   *          An EVE character ID (required)
   * @param datasource
   *          The server name you would like data from (optional, default to tranquility)
   * @return List&lt;GetCharactersCharacterIdWallets200Ok&gt;
   * @throws ApiException
   *           If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public List<GetCharactersCharacterIdWallets200Ok> getCharactersCharacterIdWallets(
                                                                                    Integer characterId,
                                                                                    String datasource)
    throws ApiException {
    ApiResponse<List<GetCharactersCharacterIdWallets200Ok>> resp = getCharactersCharacterIdWalletsWithHttpInfo(characterId, datasource);
    return resp.getData();
  }

  /**
   * List wallets and balances List your wallets and their balances. Characters typically have only one wallet, with wallet_id 1000 being the master wallet. ---
   * Alternate route: &#x60;/v1/characters/{character_id}/wallets/&#x60; Alternate route: &#x60;/legacy/characters/{character_id}/wallets/&#x60; Alternate
   * route: &#x60;/dev/characters/{character_id}/wallets/&#x60; --- This route is cached for up to 120 seconds
   * 
   * @param characterId
   *          An EVE character ID (required)
   * @param datasource
   *          The server name you would like data from (optional, default to tranquility)
   * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdWallets200Ok&gt;&gt;
   * @throws ApiException
   *           If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<List<GetCharactersCharacterIdWallets200Ok>> getCharactersCharacterIdWalletsWithHttpInfo(
                                                                                                             Integer characterId,
                                                                                                             String datasource)
    throws ApiException {
    com.squareup.okhttp.Call call = getCharactersCharacterIdWalletsCall(characterId, datasource, null, null);
    Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdWallets200Ok>>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * List wallets and balances (asynchronously) List your wallets and their balances. Characters typically have only one wallet, with wallet_id 1000 being the
   * master wallet. --- Alternate route: &#x60;/v1/characters/{character_id}/wallets/&#x60; Alternate route:
   * &#x60;/legacy/characters/{character_id}/wallets/&#x60; Alternate route: &#x60;/dev/characters/{character_id}/wallets/&#x60; --- This route is cached for up
   * to 120 seconds
   * 
   * @param characterId
   *          An EVE character ID (required)
   * @param datasource
   *          The server name you would like data from (optional, default to tranquility)
   * @param callback
   *          The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException
   *           If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call getCharactersCharacterIdWalletsAsync(
                                                                       Integer characterId,
                                                                       String datasource,
                                                                       final ApiCallback<List<GetCharactersCharacterIdWallets200Ok>> callback)
    throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(
                           long bytesRead,
                           long contentLength,
                           boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(
                                      long bytesWritten,
                                      long contentLength,
                                      boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    com.squareup.okhttp.Call call = getCharactersCharacterIdWalletsCall(characterId, datasource, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdWallets200Ok>>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
