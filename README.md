### 兴农宝-Android接口文档

1. **获取手机验证码:**
 
    * 地址: http://10.10.70.125:8090/ndb/phone/base/sendSms.do?
    * 参数:
        | param | desc | type | Required|
        | :----: |:---:| :---:|:---:|
        | phoneNo | 手机号码 | String | T |

    * 返回:
    
        ```
        "status": 400,
        "msg": "发送失败",
        "data": null
        ```
2. **登录:**

    - 地址:  http://10.10.70.125:8090/ndb/phone/base/login.do
    - 参数:

        param|desc|type|required
        ---|---|---|---|
        phoneNo | 电话号码 | String | 是
        code | 短信验证码 | String | 是

 
 - 返回: 

3. **获取业务列表:** 

 - 地址:   http://10.10.70.125:8090/ndb/phone/business/list.do
 - 参数:

    param|desc|type|required
    :---:|:---:|:---:|:---:
    phoneNo | 电话号码 | String | T
    code | 短信验证码 | String | T
    id | 登录人ID | String | T


 - 返回:
 
4. **获取业详细资料:** 

 - 地址:  http://10.10.70.125:8090/ndb/phone/business/business.do
 - 参数:
    param|desc|type|required
    :---:|:---:|:---:|:---:
          phoneNo | 电话号码 | String | T
          code | 短信验证码 | String | T
		  loanId | 借款单ID | String | T
 - 返回:
 
5. **提交基础资料:**

 - 地址:   http://10.10.70.125:8090/ndb/phone/business/addText.do
 - 参数:  
        param|desc|type|Required
        :----: |:---:| :---:|:---:
		| id | 借款单ID | String | T |
		| userId | 用户ID | String | T |
		| realName | 真实姓名 | String | T |
		| phoneNo | 电话号码 | String | T |
		| marryStatus | 婚姻状态 | String | T |
		| idCard | 身份证号码 | String | T |
		| residentialAddress | 居住地 | String | T |
		| birthAddress | 出生地 | String | T |

 - 返回: 

6. **上传图片资料:** 

    - 地址:<br>  http://10.10.70.125:8090/ndb/phone/customer/addPic.do
    - 参数:<br>

        | param | desc | type | Required|
        | :----: |:---:| :---:|:---:|
        | userId | 登录人ID | String | T |
        | loanId | 借款单号 | String | T |
        | myfile | 图片名称 | String | T |
        | picFlag | 图片标识如身份证正面反面 | String | T |






   - 返回:

7. **确认提交:**
	- 地址:<br> http://10.10.70.125:8090/ndb/phone/customer/overPic.do
	- 参数:<br>
	 
		| param | desc | type | Required|
		| :----: |:---:| :---:|:---:|
		| loanId | 借款单ID | String | T |
	- 返回:





