alter table zjmb_sw_bgk add (VC_UP_SP_FLAG  number(1) default 0);
COMMENT ON COLUMN zjmb_sw_bgk.VC_UP_SP_FLAG IS '上传台州共享平台标识， 0 为未上传 1 为已上传';