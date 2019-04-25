package com.aws.elastic.microsearch.model;


import lombok.Data;
//@Document(indexName = "search_index", type = "_doc")
@Data
public class SearchModel {
	
	private String 	ack_id 	;
	private String 	form_plan_year_begin_date	;
	private String 	form_tax_prd	;
	private String 	type_plan_entity_cd	;
	private String 	type_dfe_plan_entity_cd	;
	private String 	initial_filing_ind	;
	private String 	amended_ind	;
	private String 	final_filing_ind	;
	private String 	short_plan_yr_ind	;
	private String 	collective_bargain_ind	;
	private String 	f5558_application_filed_ind	;
	private String 	ext_automatic_ind	;
	private String 	dfvc_program_ind	;
	private String 	ext_special_ind	;
	private String 	ext_special_text	;
	private String 	plan_name	;
	private String 	spons_dfe_pn	;
	private String 	plan_eff_date	;
	private String 	sponsor_dfe_name	;
	private String 	spons_dfe_dba_name	;
	private String 	spons_dfe_care_of_name	;
	private String 	spons_dfe_mail_us_address1	;
	private String 	spons_dfe_mail_us_address2	;
	private String 	spons_dfe_mail_us_city	;
	private String 	spons_dfe_mail_us_state	;
	private String 	spons_dfe_mail_us_zip	;
	private String 	spons_dfe_mail_foreign_addr1	;
	private String 	spons_dfe_mail_foreign_addr2	;
	private String 	spons_dfe_mail_foreign_city	;
	private String 	spons_dfe_mail_forgn_prov_st	;
	private String 	spons_dfe_mail_foreign_cntry	;
	private String 	spons_dfe_mail_forgn_postal_cd	;
	private String 	spons_dfe_loc_us_address1	;
	private String 	spons_dfe_loc_us_address2	;
	private String 	spons_dfe_loc_us_city	;
	private String 	spons_dfe_loc_us_state	;
	private String 	spons_dfe_loc_us_zip	;
	private String 	spons_dfe_loc_foreign_address1	;
	private String 	spons_dfe_loc_foreign_address2	;
	private String 	spons_dfe_loc_foreign_city	;
	private String 	spons_dfe_loc_forgn_prov_st	;
	private String 	spons_dfe_loc_foreign_cntry	;
	private String 	spons_dfe_loc_forgn_postal_cd	;
	private String 	spons_dfe_ein	;
	private String 	spons_dfe_phone_num	;
	private String 	business_code	;
	private String 	admin_name	;
	private String 	admin_care_of_name	;
	private String 	admin_us_address1	;
	private String 	admin_us_address2	;
	private String 	admin_us_city	;
	private String 	admin_us_state	;
	private String 	admin_us_zip	;
	private String 	admin_foreign_address1	;
	private String 	admin_foreign_address2	;
	private String 	admin_foreign_city	;
	private String 	admin_foreign_prov_state	;
	private String 	admin_foreign_cntry	;
	private String 	admin_foreign_postal_cd	;
	private String 	admin_ein	;
	private String 	admin_phone_num	;
	private String 	last_rpt_spons_name	;
	private String 	last_rpt_spons_ein	;
	private String 	last_rpt_plan_num	;
	private String 	admin_signed_date	;
	private String 	admin_signed_name	;
	private String 	spons_signed_date	;
	private String 	spons_signed_name	;
	private String 	dfe_signed_date	;
	private String 	dfe_signed_name	;
	private String 	tot_partcp_boy_cnt	;
	private String 	tot_active_partcp_cnt	;
	private String 	rtd_sep_partcp_rcvg_cnt	;
	private String 	rtd_sep_partcp_fut_cnt	;
	private String 	subtl_act_rtd_sep_cnt	;
	private String 	benef_rcvg_bnft_cnt	;
	private String 	tot_act_rtd_sep_benef_cnt	;
	private String 	partcp_account_bal_cnt	;
	private String 	sep_partcp_partl_vstd_cnt	;
	private String 	contrib_emplrs_cnt	;
	private String 	type_pension_bnft_code	;
	private String 	type_welfare_bnft_code	;
	private String 	funding_insurance_ind	;
	private String 	funding_sec412_ind	;
	private String 	funding_trust_ind	;
	private String 	funding_gen_asset_ind	;
	private String 	benefit_insurance_ind	;
	private String 	benefit_sec412_ind	;
	private String 	benefit_trust_ind	;
	private String 	benefit_gen_asset_ind	;
	private String 	sch_r_attached_ind	;
	private String 	sch_mb_attached_ind	;
	private String 	sch_sb_attached_ind	;
	private String 	sch_h_attached_ind	;
	private String 	sch_i_attached_ind	;
	private String 	sch_a_attached_ind	;
	private String 	num_sch_a_attached_cnt	;
	private String 	sch_c_attached_ind	;
	private String 	sch_d_attached_ind	;
	private String 	sch_g_attached_ind	;
	private String 	filing_status	;
	private String 	date_received	;
	private String 	valid_admin_signature	;
	private String 	valid_dfe_signature	;
	private String 	valid_sponsor_signature	;
	private String 	admin_phone_num_foreign	;
	private String 	spons_dfe_phone_num_foreign	;
	private String 	admin_name_same_spon_ind	;
	private String 	admin_address_same_spon_ind	;
	private String 	preparer_name	;
	private String 	preparer_firm_name	;
	private String 	preparer_us_address1	;
	private String 	preparer_us_address2	;
	private String 	preparer_us_city	;
	private String 	preparer_us_state	;
	private String 	preparer_us_zip	;
	private String 	preparer_foreign_address1	;
	private String 	preparer_foreign_address2	;
	private String 	preparer_foreign_city	;
	private String 	preparer_foreign_prov_state	;
	private String 	preparer_foreign_cntry	;
	private String 	preparer_foreign_postal_cd	;
	private String 	preparer_phone_num	;
	private String 	preparer_phone_num_foreign	;
	private String 	tot_act_partcp_boy_cnt	;
	private String 	subj_m1_filing_req_ind	;
	private String 	compliance_m1_filing_req_ind	;
	private String 	m1_receipt_confirmation_code	;
	private String 	admin_manual_signed_date	;
	private String 	admin_manual_signed_name	;
	private String 	last_rpt_plan_name	;
	private String 	spons_manual_signed_date	;
	private String 	spons_manual_signed_name	;
	private String 	dfe_manual_signed_date	;
	private String 	dfe_manual_signed_name	;
	
	
	
	
	public SearchModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param ack_id
	 * @param form_plan_year_begin_date
	 * @param form_tax_prd
	 * @param type_plan_entity_cd
	 * @param type_dfe_plan_entity_cd
	 * @param initial_filing_ind
	 * @param amended_ind
	 * @param final_filing_ind
	 * @param short_plan_yr_ind
	 * @param collective_bargain_ind
	 * @param f5558_application_filed_ind
	 * @param ext_automatic_ind
	 * @param dfvc_program_ind
	 * @param ext_special_ind
	 * @param ext_special_text
	 * @param plan_name
	 * @param spons_dfe_pn
	 * @param plan_eff_date
	 * @param sponsor_dfe_name
	 * @param spons_dfe_dba_name
	 * @param spons_dfe_care_of_name
	 * @param spons_dfe_mail_us_address1
	 * @param spons_dfe_mail_us_address2
	 * @param spons_dfe_mail_us_city
	 * @param spons_dfe_mail_us_state
	 * @param spons_dfe_mail_us_zip
	 * @param spons_dfe_mail_foreign_addr1
	 * @param spons_dfe_mail_foreign_addr2
	 * @param spons_dfe_mail_foreign_city
	 * @param spons_dfe_mail_forgn_prov_st
	 * @param spons_dfe_mail_foreign_cntry
	 * @param spons_dfe_mail_forgn_postal_cd
	 * @param spons_dfe_loc_us_address1
	 * @param spons_dfe_loc_us_address2
	 * @param spons_dfe_loc_us_city
	 * @param spons_dfe_loc_us_state
	 * @param spons_dfe_loc_us_zip
	 * @param spons_dfe_loc_foreign_address1
	 * @param spons_dfe_loc_foreign_address2
	 * @param spons_dfe_loc_foreign_city
	 * @param spons_dfe_loc_forgn_prov_st
	 * @param spons_dfe_loc_foreign_cntry
	 * @param spons_dfe_loc_forgn_postal_cd
	 * @param spons_dfe_ein
	 * @param spons_dfe_phone_num
	 * @param business_code
	 * @param admin_name
	 * @param admin_care_of_name
	 * @param admin_us_address1
	 * @param admin_us_address2
	 * @param admin_us_city
	 * @param admin_us_state
	 * @param admin_us_zip
	 * @param admin_foreign_address1
	 * @param admin_foreign_address2
	 * @param admin_foreign_city
	 * @param admin_foreign_prov_state
	 * @param admin_foreign_cntry
	 * @param admin_foreign_postal_cd
	 * @param admin_ein
	 * @param admin_phone_num
	 * @param last_rpt_spons_name
	 * @param last_rpt_spons_ein
	 * @param last_rpt_plan_num
	 * @param admin_signed_date
	 * @param admin_signed_name
	 * @param spons_signed_date
	 * @param spons_signed_name
	 * @param dfe_signed_date
	 * @param dfe_signed_name
	 * @param tot_partcp_boy_cnt
	 * @param tot_active_partcp_cnt
	 * @param rtd_sep_partcp_rcvg_cnt
	 * @param rtd_sep_partcp_fut_cnt
	 * @param subtl_act_rtd_sep_cnt
	 * @param benef_rcvg_bnft_cnt
	 * @param tot_act_rtd_sep_benef_cnt
	 * @param partcp_account_bal_cnt
	 * @param sep_partcp_partl_vstd_cnt
	 * @param contrib_emplrs_cnt
	 * @param type_pension_bnft_code
	 * @param type_welfare_bnft_code
	 * @param funding_insurance_ind
	 * @param funding_sec412_ind
	 * @param funding_trust_ind
	 * @param funding_gen_asset_ind
	 * @param benefit_insurance_ind
	 * @param benefit_sec412_ind
	 * @param benefit_trust_ind
	 * @param benefit_gen_asset_ind
	 * @param sch_r_attached_ind
	 * @param sch_mb_attached_ind
	 * @param sch_sb_attached_ind
	 * @param sch_h_attached_ind
	 * @param sch_i_attached_ind
	 * @param sch_a_attached_ind
	 * @param num_sch_a_attached_cnt
	 * @param sch_c_attached_ind
	 * @param sch_d_attached_ind
	 * @param sch_g_attached_ind
	 * @param filing_status
	 * @param date_received
	 * @param valid_admin_signature
	 * @param valid_dfe_signature
	 * @param valid_sponsor_signature
	 * @param admin_phone_num_foreign
	 * @param spons_dfe_phone_num_foreign
	 * @param admin_name_same_spon_ind
	 * @param admin_address_same_spon_ind
	 * @param preparer_name
	 * @param preparer_firm_name
	 * @param preparer_us_address1
	 * @param preparer_us_address2
	 * @param preparer_us_city
	 * @param preparer_us_state
	 * @param preparer_us_zip
	 * @param preparer_foreign_address1
	 * @param preparer_foreign_address2
	 * @param preparer_foreign_city
	 * @param preparer_foreign_prov_state
	 * @param preparer_foreign_cntry
	 * @param preparer_foreign_postal_cd
	 * @param preparer_phone_num
	 * @param preparer_phone_num_foreign
	 * @param tot_act_partcp_boy_cnt
	 * @param subj_m1_filing_req_ind
	 * @param compliance_m1_filing_req_ind
	 * @param m1_receipt_confirmation_code
	 * @param admin_manual_signed_date
	 * @param admin_manual_signed_name
	 * @param last_rpt_plan_name
	 * @param spons_manual_signed_date
	 * @param spons_manual_signed_name
	 * @param dfe_manual_signed_date
	 * @param dfe_manual_signed_name
	 */
	public SearchModel(String ack_id, String form_plan_year_begin_date, String form_tax_prd, String type_plan_entity_cd,
			String type_dfe_plan_entity_cd, String initial_filing_ind, String amended_ind, String final_filing_ind,
			String short_plan_yr_ind, String collective_bargain_ind, String f5558_application_filed_ind,
			String ext_automatic_ind, String dfvc_program_ind, String ext_special_ind, String ext_special_text,
			String plan_name, String spons_dfe_pn, String plan_eff_date, String sponsor_dfe_name,
			String spons_dfe_dba_name, String spons_dfe_care_of_name, String spons_dfe_mail_us_address1,
			String spons_dfe_mail_us_address2, String spons_dfe_mail_us_city, String spons_dfe_mail_us_state,
			String spons_dfe_mail_us_zip, String spons_dfe_mail_foreign_addr1, String spons_dfe_mail_foreign_addr2,
			String spons_dfe_mail_foreign_city, String spons_dfe_mail_forgn_prov_st,
			String spons_dfe_mail_foreign_cntry, String spons_dfe_mail_forgn_postal_cd,
			String spons_dfe_loc_us_address1, String spons_dfe_loc_us_address2, String spons_dfe_loc_us_city,
			String spons_dfe_loc_us_state, String spons_dfe_loc_us_zip, String spons_dfe_loc_foreign_address1,
			String spons_dfe_loc_foreign_address2, String spons_dfe_loc_foreign_city,
			String spons_dfe_loc_forgn_prov_st, String spons_dfe_loc_foreign_cntry,
			String spons_dfe_loc_forgn_postal_cd, String spons_dfe_ein, String spons_dfe_phone_num,
			String business_code, String admin_name, String admin_care_of_name, String admin_us_address1,
			String admin_us_address2, String admin_us_city, String admin_us_state, String admin_us_zip,
			String admin_foreign_address1, String admin_foreign_address2, String admin_foreign_city,
			String admin_foreign_prov_state, String admin_foreign_cntry, String admin_foreign_postal_cd,
			String admin_ein, String admin_phone_num, String last_rpt_spons_name, String last_rpt_spons_ein,
			String last_rpt_plan_num, String admin_signed_date, String admin_signed_name, String spons_signed_date,
			String spons_signed_name, String dfe_signed_date, String dfe_signed_name, String tot_partcp_boy_cnt,
			String tot_active_partcp_cnt, String rtd_sep_partcp_rcvg_cnt, String rtd_sep_partcp_fut_cnt,
			String subtl_act_rtd_sep_cnt, String benef_rcvg_bnft_cnt, String tot_act_rtd_sep_benef_cnt,
			String partcp_account_bal_cnt, String sep_partcp_partl_vstd_cnt, String contrib_emplrs_cnt,
			String type_pension_bnft_code, String type_welfare_bnft_code, String funding_insurance_ind,
			String funding_sec412_ind, String funding_trust_ind, String funding_gen_asset_ind,
			String benefit_insurance_ind, String benefit_sec412_ind, String benefit_trust_ind,
			String benefit_gen_asset_ind, String sch_r_attached_ind, String sch_mb_attached_ind,
			String sch_sb_attached_ind, String sch_h_attached_ind, String sch_i_attached_ind, String sch_a_attached_ind,
			String num_sch_a_attached_cnt, String sch_c_attached_ind, String sch_d_attached_ind,
			String sch_g_attached_ind, String filing_status, String date_received, String valid_admin_signature,
			String valid_dfe_signature, String valid_sponsor_signature, String admin_phone_num_foreign,
			String spons_dfe_phone_num_foreign, String admin_name_same_spon_ind, String admin_address_same_spon_ind,
			String preparer_name, String preparer_firm_name, String preparer_us_address1, String preparer_us_address2,
			String preparer_us_city, String preparer_us_state, String preparer_us_zip, String preparer_foreign_address1,
			String preparer_foreign_address2, String preparer_foreign_city, String preparer_foreign_prov_state,
			String preparer_foreign_cntry, String preparer_foreign_postal_cd, String preparer_phone_num,
			String preparer_phone_num_foreign, String tot_act_partcp_boy_cnt, String subj_m1_filing_req_ind,
			String compliance_m1_filing_req_ind, String m1_receipt_confirmation_code, String admin_manual_signed_date,
			String admin_manual_signed_name, String last_rpt_plan_name, String spons_manual_signed_date,
			String spons_manual_signed_name, String dfe_manual_signed_date, String dfe_manual_signed_name) {
		super();
		this.ack_id = ack_id;
		this.form_plan_year_begin_date = form_plan_year_begin_date;
		this.form_tax_prd = form_tax_prd;
		this.type_plan_entity_cd = type_plan_entity_cd;
		this.type_dfe_plan_entity_cd = type_dfe_plan_entity_cd;
		this.initial_filing_ind = initial_filing_ind;
		this.amended_ind = amended_ind;
		this.final_filing_ind = final_filing_ind;
		this.short_plan_yr_ind = short_plan_yr_ind;
		this.collective_bargain_ind = collective_bargain_ind;
		this.f5558_application_filed_ind = f5558_application_filed_ind;
		this.ext_automatic_ind = ext_automatic_ind;
		this.dfvc_program_ind = dfvc_program_ind;
		this.ext_special_ind = ext_special_ind;
		this.ext_special_text = ext_special_text;
		this.plan_name = plan_name;
		this.spons_dfe_pn = spons_dfe_pn;
		this.plan_eff_date = plan_eff_date;
		this.sponsor_dfe_name = sponsor_dfe_name;
		this.spons_dfe_dba_name = spons_dfe_dba_name;
		this.spons_dfe_care_of_name = spons_dfe_care_of_name;
		this.spons_dfe_mail_us_address1 = spons_dfe_mail_us_address1;
		this.spons_dfe_mail_us_address2 = spons_dfe_mail_us_address2;
		this.spons_dfe_mail_us_city = spons_dfe_mail_us_city;
		this.spons_dfe_mail_us_state = spons_dfe_mail_us_state;
		this.spons_dfe_mail_us_zip = spons_dfe_mail_us_zip;
		this.spons_dfe_mail_foreign_addr1 = spons_dfe_mail_foreign_addr1;
		this.spons_dfe_mail_foreign_addr2 = spons_dfe_mail_foreign_addr2;
		this.spons_dfe_mail_foreign_city = spons_dfe_mail_foreign_city;
		this.spons_dfe_mail_forgn_prov_st = spons_dfe_mail_forgn_prov_st;
		this.spons_dfe_mail_foreign_cntry = spons_dfe_mail_foreign_cntry;
		this.spons_dfe_mail_forgn_postal_cd = spons_dfe_mail_forgn_postal_cd;
		this.spons_dfe_loc_us_address1 = spons_dfe_loc_us_address1;
		this.spons_dfe_loc_us_address2 = spons_dfe_loc_us_address2;
		this.spons_dfe_loc_us_city = spons_dfe_loc_us_city;
		this.spons_dfe_loc_us_state = spons_dfe_loc_us_state;
		this.spons_dfe_loc_us_zip = spons_dfe_loc_us_zip;
		this.spons_dfe_loc_foreign_address1 = spons_dfe_loc_foreign_address1;
		this.spons_dfe_loc_foreign_address2 = spons_dfe_loc_foreign_address2;
		this.spons_dfe_loc_foreign_city = spons_dfe_loc_foreign_city;
		this.spons_dfe_loc_forgn_prov_st = spons_dfe_loc_forgn_prov_st;
		this.spons_dfe_loc_foreign_cntry = spons_dfe_loc_foreign_cntry;
		this.spons_dfe_loc_forgn_postal_cd = spons_dfe_loc_forgn_postal_cd;
		this.spons_dfe_ein = spons_dfe_ein;
		this.spons_dfe_phone_num = spons_dfe_phone_num;
		this.business_code = business_code;
		this.admin_name = admin_name;
		this.admin_care_of_name = admin_care_of_name;
		this.admin_us_address1 = admin_us_address1;
		this.admin_us_address2 = admin_us_address2;
		this.admin_us_city = admin_us_city;
		this.admin_us_state = admin_us_state;
		this.admin_us_zip = admin_us_zip;
		this.admin_foreign_address1 = admin_foreign_address1;
		this.admin_foreign_address2 = admin_foreign_address2;
		this.admin_foreign_city = admin_foreign_city;
		this.admin_foreign_prov_state = admin_foreign_prov_state;
		this.admin_foreign_cntry = admin_foreign_cntry;
		this.admin_foreign_postal_cd = admin_foreign_postal_cd;
		this.admin_ein = admin_ein;
		this.admin_phone_num = admin_phone_num;
		this.last_rpt_spons_name = last_rpt_spons_name;
		this.last_rpt_spons_ein = last_rpt_spons_ein;
		this.last_rpt_plan_num = last_rpt_plan_num;
		this.admin_signed_date = admin_signed_date;
		this.admin_signed_name = admin_signed_name;
		this.spons_signed_date = spons_signed_date;
		this.spons_signed_name = spons_signed_name;
		this.dfe_signed_date = dfe_signed_date;
		this.dfe_signed_name = dfe_signed_name;
		this.tot_partcp_boy_cnt = tot_partcp_boy_cnt;
		this.tot_active_partcp_cnt = tot_active_partcp_cnt;
		this.rtd_sep_partcp_rcvg_cnt = rtd_sep_partcp_rcvg_cnt;
		this.rtd_sep_partcp_fut_cnt = rtd_sep_partcp_fut_cnt;
		this.subtl_act_rtd_sep_cnt = subtl_act_rtd_sep_cnt;
		this.benef_rcvg_bnft_cnt = benef_rcvg_bnft_cnt;
		this.tot_act_rtd_sep_benef_cnt = tot_act_rtd_sep_benef_cnt;
		this.partcp_account_bal_cnt = partcp_account_bal_cnt;
		this.sep_partcp_partl_vstd_cnt = sep_partcp_partl_vstd_cnt;
		this.contrib_emplrs_cnt = contrib_emplrs_cnt;
		this.type_pension_bnft_code = type_pension_bnft_code;
		this.type_welfare_bnft_code = type_welfare_bnft_code;
		this.funding_insurance_ind = funding_insurance_ind;
		this.funding_sec412_ind = funding_sec412_ind;
		this.funding_trust_ind = funding_trust_ind;
		this.funding_gen_asset_ind = funding_gen_asset_ind;
		this.benefit_insurance_ind = benefit_insurance_ind;
		this.benefit_sec412_ind = benefit_sec412_ind;
		this.benefit_trust_ind = benefit_trust_ind;
		this.benefit_gen_asset_ind = benefit_gen_asset_ind;
		this.sch_r_attached_ind = sch_r_attached_ind;
		this.sch_mb_attached_ind = sch_mb_attached_ind;
		this.sch_sb_attached_ind = sch_sb_attached_ind;
		this.sch_h_attached_ind = sch_h_attached_ind;
		this.sch_i_attached_ind = sch_i_attached_ind;
		this.sch_a_attached_ind = sch_a_attached_ind;
		this.num_sch_a_attached_cnt = num_sch_a_attached_cnt;
		this.sch_c_attached_ind = sch_c_attached_ind;
		this.sch_d_attached_ind = sch_d_attached_ind;
		this.sch_g_attached_ind = sch_g_attached_ind;
		this.filing_status = filing_status;
		this.date_received = date_received;
		this.valid_admin_signature = valid_admin_signature;
		this.valid_dfe_signature = valid_dfe_signature;
		this.valid_sponsor_signature = valid_sponsor_signature;
		this.admin_phone_num_foreign = admin_phone_num_foreign;
		this.spons_dfe_phone_num_foreign = spons_dfe_phone_num_foreign;
		this.admin_name_same_spon_ind = admin_name_same_spon_ind;
		this.admin_address_same_spon_ind = admin_address_same_spon_ind;
		this.preparer_name = preparer_name;
		this.preparer_firm_name = preparer_firm_name;
		this.preparer_us_address1 = preparer_us_address1;
		this.preparer_us_address2 = preparer_us_address2;
		this.preparer_us_city = preparer_us_city;
		this.preparer_us_state = preparer_us_state;
		this.preparer_us_zip = preparer_us_zip;
		this.preparer_foreign_address1 = preparer_foreign_address1;
		this.preparer_foreign_address2 = preparer_foreign_address2;
		this.preparer_foreign_city = preparer_foreign_city;
		this.preparer_foreign_prov_state = preparer_foreign_prov_state;
		this.preparer_foreign_cntry = preparer_foreign_cntry;
		this.preparer_foreign_postal_cd = preparer_foreign_postal_cd;
		this.preparer_phone_num = preparer_phone_num;
		this.preparer_phone_num_foreign = preparer_phone_num_foreign;
		this.tot_act_partcp_boy_cnt = tot_act_partcp_boy_cnt;
		this.subj_m1_filing_req_ind = subj_m1_filing_req_ind;
		this.compliance_m1_filing_req_ind = compliance_m1_filing_req_ind;
		this.m1_receipt_confirmation_code = m1_receipt_confirmation_code;
		this.admin_manual_signed_date = admin_manual_signed_date;
		this.admin_manual_signed_name = admin_manual_signed_name;
		this.last_rpt_plan_name = last_rpt_plan_name;
		this.spons_manual_signed_date = spons_manual_signed_date;
		this.spons_manual_signed_name = spons_manual_signed_name;
		this.dfe_manual_signed_date = dfe_manual_signed_date;
		this.dfe_manual_signed_name = dfe_manual_signed_name;
	}



	/**
	 * @return the ack_id
	 */
	public String getAck_id() {
		return ack_id;
	}
	/**
	 * @param ack_id the ack_id to set
	 */
	public void setAck_id(String ack_id) {
		this.ack_id = ack_id;
	}
	/**
	 * @return the form_plan_year_begin_date
	 */
	public String getForm_plan_year_begin_date() {
		return form_plan_year_begin_date;
	}
	/**
	 * @param form_plan_year_begin_date the form_plan_year_begin_date to set
	 */
	public void setForm_plan_year_begin_date(String form_plan_year_begin_date) {
		this.form_plan_year_begin_date = form_plan_year_begin_date;
	}
	/**
	 * @return the form_tax_prd
	 */
	public String getForm_tax_prd() {
		return form_tax_prd;
	}
	/**
	 * @param form_tax_prd the form_tax_prd to set
	 */
	public void setForm_tax_prd(String form_tax_prd) {
		this.form_tax_prd = form_tax_prd;
	}
	/**
	 * @return the type_plan_entity_cd
	 */
	public String getType_plan_entity_cd() {
		return type_plan_entity_cd;
	}
	/**
	 * @param type_plan_entity_cd the type_plan_entity_cd to set
	 */
	public void setType_plan_entity_cd(String type_plan_entity_cd) {
		this.type_plan_entity_cd = type_plan_entity_cd;
	}
	/**
	 * @return the type_dfe_plan_entity_cd
	 */
	public String getType_dfe_plan_entity_cd() {
		return type_dfe_plan_entity_cd;
	}
	/**
	 * @param type_dfe_plan_entity_cd the type_dfe_plan_entity_cd to set
	 */
	public void setType_dfe_plan_entity_cd(String type_dfe_plan_entity_cd) {
		this.type_dfe_plan_entity_cd = type_dfe_plan_entity_cd;
	}
	/**
	 * @return the initial_filing_ind
	 */
	public String getInitial_filing_ind() {
		return initial_filing_ind;
	}
	/**
	 * @param initial_filing_ind the initial_filing_ind to set
	 */
	public void setInitial_filing_ind(String initial_filing_ind) {
		this.initial_filing_ind = initial_filing_ind;
	}
	/**
	 * @return the amended_ind
	 */
	public String getAmended_ind() {
		return amended_ind;
	}
	/**
	 * @param amended_ind the amended_ind to set
	 */
	public void setAmended_ind(String amended_ind) {
		this.amended_ind = amended_ind;
	}
	/**
	 * @return the final_filing_ind
	 */
	public String getFinal_filing_ind() {
		return final_filing_ind;
	}
	/**
	 * @param final_filing_ind the final_filing_ind to set
	 */
	public void setFinal_filing_ind(String final_filing_ind) {
		this.final_filing_ind = final_filing_ind;
	}
	/**
	 * @return the short_plan_yr_ind
	 */
	public String getShort_plan_yr_ind() {
		return short_plan_yr_ind;
	}
	/**
	 * @param short_plan_yr_ind the short_plan_yr_ind to set
	 */
	public void setShort_plan_yr_ind(String short_plan_yr_ind) {
		this.short_plan_yr_ind = short_plan_yr_ind;
	}
	/**
	 * @return the collective_bargain_ind
	 */
	public String getCollective_bargain_ind() {
		return collective_bargain_ind;
	}
	/**
	 * @param collective_bargain_ind the collective_bargain_ind to set
	 */
	public void setCollective_bargain_ind(String collective_bargain_ind) {
		this.collective_bargain_ind = collective_bargain_ind;
	}
	/**
	 * @return the f5558_application_filed_ind
	 */
	public String getF5558_application_filed_ind() {
		return f5558_application_filed_ind;
	}
	/**
	 * @param f5558_application_filed_ind the f5558_application_filed_ind to set
	 */
	public void setF5558_application_filed_ind(String f5558_application_filed_ind) {
		this.f5558_application_filed_ind = f5558_application_filed_ind;
	}
	/**
	 * @return the ext_automatic_ind
	 */
	public String getExt_automatic_ind() {
		return ext_automatic_ind;
	}
	/**
	 * @param ext_automatic_ind the ext_automatic_ind to set
	 */
	public void setExt_automatic_ind(String ext_automatic_ind) {
		this.ext_automatic_ind = ext_automatic_ind;
	}
	/**
	 * @return the dfvc_program_ind
	 */
	public String getDfvc_program_ind() {
		return dfvc_program_ind;
	}
	/**
	 * @param dfvc_program_ind the dfvc_program_ind to set
	 */
	public void setDfvc_program_ind(String dfvc_program_ind) {
		this.dfvc_program_ind = dfvc_program_ind;
	}
	/**
	 * @return the ext_special_ind
	 */
	public String getExt_special_ind() {
		return ext_special_ind;
	}
	/**
	 * @param ext_special_ind the ext_special_ind to set
	 */
	public void setExt_special_ind(String ext_special_ind) {
		this.ext_special_ind = ext_special_ind;
	}
	/**
	 * @return the ext_special_text
	 */
	public String getExt_special_text() {
		return ext_special_text;
	}
	/**
	 * @param ext_special_text the ext_special_text to set
	 */
	public void setExt_special_text(String ext_special_text) {
		this.ext_special_text = ext_special_text;
	}
	/**
	 * @return the plan_name
	 */
	public String getPlan_name() {
		return plan_name;
	}
	/**
	 * @param plan_name the plan_name to set
	 */
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	/**
	 * @return the spons_dfe_pn
	 */
	public String getSpons_dfe_pn() {
		return spons_dfe_pn;
	}
	/**
	 * @param spons_dfe_pn the spons_dfe_pn to set
	 */
	public void setSpons_dfe_pn(String spons_dfe_pn) {
		this.spons_dfe_pn = spons_dfe_pn;
	}
	/**
	 * @return the plan_eff_date
	 */
	public String getPlan_eff_date() {
		return plan_eff_date;
	}
	/**
	 * @param plan_eff_date the plan_eff_date to set
	 */
	public void setPlan_eff_date(String plan_eff_date) {
		this.plan_eff_date = plan_eff_date;
	}
	/**
	 * @return the sponsor_dfe_name
	 */
	public String getSponsor_dfe_name() {
		return sponsor_dfe_name;
	}
	/**
	 * @param sponsor_dfe_name the sponsor_dfe_name to set
	 */
	public void setSponsor_dfe_name(String sponsor_dfe_name) {
		this.sponsor_dfe_name = sponsor_dfe_name;
	}
	/**
	 * @return the spons_dfe_dba_name
	 */
	public String getSpons_dfe_dba_name() {
		return spons_dfe_dba_name;
	}
	/**
	 * @param spons_dfe_dba_name the spons_dfe_dba_name to set
	 */
	public void setSpons_dfe_dba_name(String spons_dfe_dba_name) {
		this.spons_dfe_dba_name = spons_dfe_dba_name;
	}
	/**
	 * @return the spons_dfe_care_of_name
	 */
	public String getSpons_dfe_care_of_name() {
		return spons_dfe_care_of_name;
	}
	/**
	 * @param spons_dfe_care_of_name the spons_dfe_care_of_name to set
	 */
	public void setSpons_dfe_care_of_name(String spons_dfe_care_of_name) {
		this.spons_dfe_care_of_name = spons_dfe_care_of_name;
	}
	/**
	 * @return the spons_dfe_mail_us_address1
	 */
	public String getSpons_dfe_mail_us_address1() {
		return spons_dfe_mail_us_address1;
	}
	/**
	 * @param spons_dfe_mail_us_address1 the spons_dfe_mail_us_address1 to set
	 */
	public void setSpons_dfe_mail_us_address1(String spons_dfe_mail_us_address1) {
		this.spons_dfe_mail_us_address1 = spons_dfe_mail_us_address1;
	}
	/**
	 * @return the spons_dfe_mail_us_address2
	 */
	public String getSpons_dfe_mail_us_address2() {
		return spons_dfe_mail_us_address2;
	}
	/**
	 * @param spons_dfe_mail_us_address2 the spons_dfe_mail_us_address2 to set
	 */
	public void setSpons_dfe_mail_us_address2(String spons_dfe_mail_us_address2) {
		this.spons_dfe_mail_us_address2 = spons_dfe_mail_us_address2;
	}
	/**
	 * @return the spons_dfe_mail_us_city
	 */
	public String getSpons_dfe_mail_us_city() {
		return spons_dfe_mail_us_city;
	}
	/**
	 * @param spons_dfe_mail_us_city the spons_dfe_mail_us_city to set
	 */
	public void setSpons_dfe_mail_us_city(String spons_dfe_mail_us_city) {
		this.spons_dfe_mail_us_city = spons_dfe_mail_us_city;
	}
	/**
	 * @return the spons_dfe_mail_us_state
	 */
	public String getSpons_dfe_mail_us_state() {
		return spons_dfe_mail_us_state;
	}
	/**
	 * @param spons_dfe_mail_us_state the spons_dfe_mail_us_state to set
	 */
	public void setSpons_dfe_mail_us_state(String spons_dfe_mail_us_state) {
		this.spons_dfe_mail_us_state = spons_dfe_mail_us_state;
	}
	/**
	 * @return the spons_dfe_mail_us_zip
	 */
	public String getSpons_dfe_mail_us_zip() {
		return spons_dfe_mail_us_zip;
	}
	/**
	 * @param spons_dfe_mail_us_zip the spons_dfe_mail_us_zip to set
	 */
	public void setSpons_dfe_mail_us_zip(String spons_dfe_mail_us_zip) {
		this.spons_dfe_mail_us_zip = spons_dfe_mail_us_zip;
	}
	/**
	 * @return the spons_dfe_mail_foreign_addr1
	 */
	public String getSpons_dfe_mail_foreign_addr1() {
		return spons_dfe_mail_foreign_addr1;
	}
	/**
	 * @param spons_dfe_mail_foreign_addr1 the spons_dfe_mail_foreign_addr1 to set
	 */
	public void setSpons_dfe_mail_foreign_addr1(String spons_dfe_mail_foreign_addr1) {
		this.spons_dfe_mail_foreign_addr1 = spons_dfe_mail_foreign_addr1;
	}
	/**
	 * @return the spons_dfe_mail_foreign_addr2
	 */
	public String getSpons_dfe_mail_foreign_addr2() {
		return spons_dfe_mail_foreign_addr2;
	}
	/**
	 * @param spons_dfe_mail_foreign_addr2 the spons_dfe_mail_foreign_addr2 to set
	 */
	public void setSpons_dfe_mail_foreign_addr2(String spons_dfe_mail_foreign_addr2) {
		this.spons_dfe_mail_foreign_addr2 = spons_dfe_mail_foreign_addr2;
	}
	/**
	 * @return the spons_dfe_mail_foreign_city
	 */
	public String getSpons_dfe_mail_foreign_city() {
		return spons_dfe_mail_foreign_city;
	}
	/**
	 * @param spons_dfe_mail_foreign_city the spons_dfe_mail_foreign_city to set
	 */
	public void setSpons_dfe_mail_foreign_city(String spons_dfe_mail_foreign_city) {
		this.spons_dfe_mail_foreign_city = spons_dfe_mail_foreign_city;
	}
	/**
	 * @return the spons_dfe_mail_forgn_prov_st
	 */
	public String getSpons_dfe_mail_forgn_prov_st() {
		return spons_dfe_mail_forgn_prov_st;
	}
	/**
	 * @param spons_dfe_mail_forgn_prov_st the spons_dfe_mail_forgn_prov_st to set
	 */
	public void setSpons_dfe_mail_forgn_prov_st(String spons_dfe_mail_forgn_prov_st) {
		this.spons_dfe_mail_forgn_prov_st = spons_dfe_mail_forgn_prov_st;
	}
	/**
	 * @return the spons_dfe_mail_foreign_cntry
	 */
	public String getSpons_dfe_mail_foreign_cntry() {
		return spons_dfe_mail_foreign_cntry;
	}
	/**
	 * @param spons_dfe_mail_foreign_cntry the spons_dfe_mail_foreign_cntry to set
	 */
	public void setSpons_dfe_mail_foreign_cntry(String spons_dfe_mail_foreign_cntry) {
		this.spons_dfe_mail_foreign_cntry = spons_dfe_mail_foreign_cntry;
	}
	/**
	 * @return the spons_dfe_mail_forgn_postal_cd
	 */
	public String getSpons_dfe_mail_forgn_postal_cd() {
		return spons_dfe_mail_forgn_postal_cd;
	}
	/**
	 * @param spons_dfe_mail_forgn_postal_cd the spons_dfe_mail_forgn_postal_cd to set
	 */
	public void setSpons_dfe_mail_forgn_postal_cd(String spons_dfe_mail_forgn_postal_cd) {
		this.spons_dfe_mail_forgn_postal_cd = spons_dfe_mail_forgn_postal_cd;
	}
	/**
	 * @return the spons_dfe_loc_us_address1
	 */
	public String getSpons_dfe_loc_us_address1() {
		return spons_dfe_loc_us_address1;
	}
	/**
	 * @param spons_dfe_loc_us_address1 the spons_dfe_loc_us_address1 to set
	 */
	public void setSpons_dfe_loc_us_address1(String spons_dfe_loc_us_address1) {
		this.spons_dfe_loc_us_address1 = spons_dfe_loc_us_address1;
	}
	/**
	 * @return the spons_dfe_loc_us_address2
	 */
	public String getSpons_dfe_loc_us_address2() {
		return spons_dfe_loc_us_address2;
	}
	/**
	 * @param spons_dfe_loc_us_address2 the spons_dfe_loc_us_address2 to set
	 */
	public void setSpons_dfe_loc_us_address2(String spons_dfe_loc_us_address2) {
		this.spons_dfe_loc_us_address2 = spons_dfe_loc_us_address2;
	}
	/**
	 * @return the spons_dfe_loc_us_city
	 */
	public String getSpons_dfe_loc_us_city() {
		return spons_dfe_loc_us_city;
	}
	/**
	 * @param spons_dfe_loc_us_city the spons_dfe_loc_us_city to set
	 */
	public void setSpons_dfe_loc_us_city(String spons_dfe_loc_us_city) {
		this.spons_dfe_loc_us_city = spons_dfe_loc_us_city;
	}
	/**
	 * @return the spons_dfe_loc_us_state
	 */
	public String getSpons_dfe_loc_us_state() {
		return spons_dfe_loc_us_state;
	}
	/**
	 * @param spons_dfe_loc_us_state the spons_dfe_loc_us_state to set
	 */
	public void setSpons_dfe_loc_us_state(String spons_dfe_loc_us_state) {
		this.spons_dfe_loc_us_state = spons_dfe_loc_us_state;
	}
	/**
	 * @return the spons_dfe_loc_us_zip
	 */
	public String getSpons_dfe_loc_us_zip() {
		return spons_dfe_loc_us_zip;
	}
	/**
	 * @param spons_dfe_loc_us_zip the spons_dfe_loc_us_zip to set
	 */
	public void setSpons_dfe_loc_us_zip(String spons_dfe_loc_us_zip) {
		this.spons_dfe_loc_us_zip = spons_dfe_loc_us_zip;
	}
	/**
	 * @return the spons_dfe_loc_foreign_address1
	 */
	public String getSpons_dfe_loc_foreign_address1() {
		return spons_dfe_loc_foreign_address1;
	}
	/**
	 * @param spons_dfe_loc_foreign_address1 the spons_dfe_loc_foreign_address1 to set
	 */
	public void setSpons_dfe_loc_foreign_address1(String spons_dfe_loc_foreign_address1) {
		this.spons_dfe_loc_foreign_address1 = spons_dfe_loc_foreign_address1;
	}
	/**
	 * @return the spons_dfe_loc_foreign_address2
	 */
	public String getSpons_dfe_loc_foreign_address2() {
		return spons_dfe_loc_foreign_address2;
	}
	/**
	 * @param spons_dfe_loc_foreign_address2 the spons_dfe_loc_foreign_address2 to set
	 */
	public void setSpons_dfe_loc_foreign_address2(String spons_dfe_loc_foreign_address2) {
		this.spons_dfe_loc_foreign_address2 = spons_dfe_loc_foreign_address2;
	}
	/**
	 * @return the spons_dfe_loc_foreign_city
	 */
	public String getSpons_dfe_loc_foreign_city() {
		return spons_dfe_loc_foreign_city;
	}
	/**
	 * @param spons_dfe_loc_foreign_city the spons_dfe_loc_foreign_city to set
	 */
	public void setSpons_dfe_loc_foreign_city(String spons_dfe_loc_foreign_city) {
		this.spons_dfe_loc_foreign_city = spons_dfe_loc_foreign_city;
	}
	/**
	 * @return the spons_dfe_loc_forgn_prov_st
	 */
	public String getSpons_dfe_loc_forgn_prov_st() {
		return spons_dfe_loc_forgn_prov_st;
	}
	/**
	 * @param spons_dfe_loc_forgn_prov_st the spons_dfe_loc_forgn_prov_st to set
	 */
	public void setSpons_dfe_loc_forgn_prov_st(String spons_dfe_loc_forgn_prov_st) {
		this.spons_dfe_loc_forgn_prov_st = spons_dfe_loc_forgn_prov_st;
	}
	/**
	 * @return the spons_dfe_loc_foreign_cntry
	 */
	public String getSpons_dfe_loc_foreign_cntry() {
		return spons_dfe_loc_foreign_cntry;
	}
	/**
	 * @param spons_dfe_loc_foreign_cntry the spons_dfe_loc_foreign_cntry to set
	 */
	public void setSpons_dfe_loc_foreign_cntry(String spons_dfe_loc_foreign_cntry) {
		this.spons_dfe_loc_foreign_cntry = spons_dfe_loc_foreign_cntry;
	}
	/**
	 * @return the spons_dfe_loc_forgn_postal_cd
	 */
	public String getSpons_dfe_loc_forgn_postal_cd() {
		return spons_dfe_loc_forgn_postal_cd;
	}
	/**
	 * @param spons_dfe_loc_forgn_postal_cd the spons_dfe_loc_forgn_postal_cd to set
	 */
	public void setSpons_dfe_loc_forgn_postal_cd(String spons_dfe_loc_forgn_postal_cd) {
		this.spons_dfe_loc_forgn_postal_cd = spons_dfe_loc_forgn_postal_cd;
	}
	/**
	 * @return the spons_dfe_ein
	 */
	public String getSpons_dfe_ein() {
		return spons_dfe_ein;
	}
	/**
	 * @param spons_dfe_ein the spons_dfe_ein to set
	 */
	public void setSpons_dfe_ein(String spons_dfe_ein) {
		this.spons_dfe_ein = spons_dfe_ein;
	}
	/**
	 * @return the spons_dfe_phone_num
	 */
	public String getSpons_dfe_phone_num() {
		return spons_dfe_phone_num;
	}
	/**
	 * @param spons_dfe_phone_num the spons_dfe_phone_num to set
	 */
	public void setSpons_dfe_phone_num(String spons_dfe_phone_num) {
		this.spons_dfe_phone_num = spons_dfe_phone_num;
	}
	/**
	 * @return the business_code
	 */
	public String getBusiness_code() {
		return business_code;
	}
	/**
	 * @param business_code the business_code to set
	 */
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
	/**
	 * @return the admin_name
	 */
	public String getAdmin_name() {
		return admin_name;
	}
	/**
	 * @param admin_name the admin_name to set
	 */
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	/**
	 * @return the admin_care_of_name
	 */
	public String getAdmin_care_of_name() {
		return admin_care_of_name;
	}
	/**
	 * @param admin_care_of_name the admin_care_of_name to set
	 */
	public void setAdmin_care_of_name(String admin_care_of_name) {
		this.admin_care_of_name = admin_care_of_name;
	}
	/**
	 * @return the admin_us_address1
	 */
	public String getAdmin_us_address1() {
		return admin_us_address1;
	}
	/**
	 * @param admin_us_address1 the admin_us_address1 to set
	 */
	public void setAdmin_us_address1(String admin_us_address1) {
		this.admin_us_address1 = admin_us_address1;
	}
	/**
	 * @return the admin_us_address2
	 */
	public String getAdmin_us_address2() {
		return admin_us_address2;
	}
	/**
	 * @param admin_us_address2 the admin_us_address2 to set
	 */
	public void setAdmin_us_address2(String admin_us_address2) {
		this.admin_us_address2 = admin_us_address2;
	}
	/**
	 * @return the admin_us_city
	 */
	public String getAdmin_us_city() {
		return admin_us_city;
	}
	/**
	 * @param admin_us_city the admin_us_city to set
	 */
	public void setAdmin_us_city(String admin_us_city) {
		this.admin_us_city = admin_us_city;
	}
	/**
	 * @return the admin_us_state
	 */
	public String getAdmin_us_state() {
		return admin_us_state;
	}
	/**
	 * @param admin_us_state the admin_us_state to set
	 */
	public void setAdmin_us_state(String admin_us_state) {
		this.admin_us_state = admin_us_state;
	}
	/**
	 * @return the admin_us_zip
	 */
	public String getAdmin_us_zip() {
		return admin_us_zip;
	}
	/**
	 * @param admin_us_zip the admin_us_zip to set
	 */
	public void setAdmin_us_zip(String admin_us_zip) {
		this.admin_us_zip = admin_us_zip;
	}
	/**
	 * @return the admin_foreign_address1
	 */
	public String getAdmin_foreign_address1() {
		return admin_foreign_address1;
	}
	/**
	 * @param admin_foreign_address1 the admin_foreign_address1 to set
	 */
	public void setAdmin_foreign_address1(String admin_foreign_address1) {
		this.admin_foreign_address1 = admin_foreign_address1;
	}
	/**
	 * @return the admin_foreign_address2
	 */
	public String getAdmin_foreign_address2() {
		return admin_foreign_address2;
	}
	/**
	 * @param admin_foreign_address2 the admin_foreign_address2 to set
	 */
	public void setAdmin_foreign_address2(String admin_foreign_address2) {
		this.admin_foreign_address2 = admin_foreign_address2;
	}
	/**
	 * @return the admin_foreign_city
	 */
	public String getAdmin_foreign_city() {
		return admin_foreign_city;
	}
	/**
	 * @param admin_foreign_city the admin_foreign_city to set
	 */
	public void setAdmin_foreign_city(String admin_foreign_city) {
		this.admin_foreign_city = admin_foreign_city;
	}
	/**
	 * @return the admin_foreign_prov_state
	 */
	public String getAdmin_foreign_prov_state() {
		return admin_foreign_prov_state;
	}
	/**
	 * @param admin_foreign_prov_state the admin_foreign_prov_state to set
	 */
	public void setAdmin_foreign_prov_state(String admin_foreign_prov_state) {
		this.admin_foreign_prov_state = admin_foreign_prov_state;
	}
	/**
	 * @return the admin_foreign_cntry
	 */
	public String getAdmin_foreign_cntry() {
		return admin_foreign_cntry;
	}
	/**
	 * @param admin_foreign_cntry the admin_foreign_cntry to set
	 */
	public void setAdmin_foreign_cntry(String admin_foreign_cntry) {
		this.admin_foreign_cntry = admin_foreign_cntry;
	}
	/**
	 * @return the admin_foreign_postal_cd
	 */
	public String getAdmin_foreign_postal_cd() {
		return admin_foreign_postal_cd;
	}
	/**
	 * @param admin_foreign_postal_cd the admin_foreign_postal_cd to set
	 */
	public void setAdmin_foreign_postal_cd(String admin_foreign_postal_cd) {
		this.admin_foreign_postal_cd = admin_foreign_postal_cd;
	}
	/**
	 * @return the admin_ein
	 */
	public String getAdmin_ein() {
		return admin_ein;
	}
	/**
	 * @param admin_ein the admin_ein to set
	 */
	public void setAdmin_ein(String admin_ein) {
		this.admin_ein = admin_ein;
	}
	/**
	 * @return the admin_phone_num
	 */
	public String getAdmin_phone_num() {
		return admin_phone_num;
	}
	/**
	 * @param admin_phone_num the admin_phone_num to set
	 */
	public void setAdmin_phone_num(String admin_phone_num) {
		this.admin_phone_num = admin_phone_num;
	}
	/**
	 * @return the last_rpt_spons_name
	 */
	public String getLast_rpt_spons_name() {
		return last_rpt_spons_name;
	}
	/**
	 * @param last_rpt_spons_name the last_rpt_spons_name to set
	 */
	public void setLast_rpt_spons_name(String last_rpt_spons_name) {
		this.last_rpt_spons_name = last_rpt_spons_name;
	}
	/**
	 * @return the last_rpt_spons_ein
	 */
	public String getLast_rpt_spons_ein() {
		return last_rpt_spons_ein;
	}
	/**
	 * @param last_rpt_spons_ein the last_rpt_spons_ein to set
	 */
	public void setLast_rpt_spons_ein(String last_rpt_spons_ein) {
		this.last_rpt_spons_ein = last_rpt_spons_ein;
	}
	/**
	 * @return the last_rpt_plan_num
	 */
	public String getLast_rpt_plan_num() {
		return last_rpt_plan_num;
	}
	/**
	 * @param last_rpt_plan_num the last_rpt_plan_num to set
	 */
	public void setLast_rpt_plan_num(String last_rpt_plan_num) {
		this.last_rpt_plan_num = last_rpt_plan_num;
	}
	/**
	 * @return the admin_signed_date
	 */
	public String getAdmin_signed_date() {
		return admin_signed_date;
	}
	/**
	 * @param admin_signed_date the admin_signed_date to set
	 */
	public void setAdmin_signed_date(String admin_signed_date) {
		this.admin_signed_date = admin_signed_date;
	}
	/**
	 * @return the admin_signed_name
	 */
	public String getAdmin_signed_name() {
		return admin_signed_name;
	}
	/**
	 * @param admin_signed_name the admin_signed_name to set
	 */
	public void setAdmin_signed_name(String admin_signed_name) {
		this.admin_signed_name = admin_signed_name;
	}
	/**
	 * @return the spons_signed_date
	 */
	public String getSpons_signed_date() {
		return spons_signed_date;
	}
	/**
	 * @param spons_signed_date the spons_signed_date to set
	 */
	public void setSpons_signed_date(String spons_signed_date) {
		this.spons_signed_date = spons_signed_date;
	}
	/**
	 * @return the spons_signed_name
	 */
	public String getSpons_signed_name() {
		return spons_signed_name;
	}
	/**
	 * @param spons_signed_name the spons_signed_name to set
	 */
	public void setSpons_signed_name(String spons_signed_name) {
		this.spons_signed_name = spons_signed_name;
	}
	/**
	 * @return the dfe_signed_date
	 */
	public String getDfe_signed_date() {
		return dfe_signed_date;
	}
	/**
	 * @param dfe_signed_date the dfe_signed_date to set
	 */
	public void setDfe_signed_date(String dfe_signed_date) {
		this.dfe_signed_date = dfe_signed_date;
	}
	/**
	 * @return the dfe_signed_name
	 */
	public String getDfe_signed_name() {
		return dfe_signed_name;
	}
	/**
	 * @param dfe_signed_name the dfe_signed_name to set
	 */
	public void setDfe_signed_name(String dfe_signed_name) {
		this.dfe_signed_name = dfe_signed_name;
	}
	/**
	 * @return the tot_partcp_boy_cnt
	 */
	public String getTot_partcp_boy_cnt() {
		return tot_partcp_boy_cnt;
	}
	/**
	 * @param tot_partcp_boy_cnt the tot_partcp_boy_cnt to set
	 */
	public void setTot_partcp_boy_cnt(String tot_partcp_boy_cnt) {
		this.tot_partcp_boy_cnt = tot_partcp_boy_cnt;
	}
	/**
	 * @return the tot_active_partcp_cnt
	 */
	public String getTot_active_partcp_cnt() {
		return tot_active_partcp_cnt;
	}
	/**
	 * @param tot_active_partcp_cnt the tot_active_partcp_cnt to set
	 */
	public void setTot_active_partcp_cnt(String tot_active_partcp_cnt) {
		this.tot_active_partcp_cnt = tot_active_partcp_cnt;
	}
	/**
	 * @return the rtd_sep_partcp_rcvg_cnt
	 */
	public String getRtd_sep_partcp_rcvg_cnt() {
		return rtd_sep_partcp_rcvg_cnt;
	}
	/**
	 * @param rtd_sep_partcp_rcvg_cnt the rtd_sep_partcp_rcvg_cnt to set
	 */
	public void setRtd_sep_partcp_rcvg_cnt(String rtd_sep_partcp_rcvg_cnt) {
		this.rtd_sep_partcp_rcvg_cnt = rtd_sep_partcp_rcvg_cnt;
	}
	/**
	 * @return the rtd_sep_partcp_fut_cnt
	 */
	public String getRtd_sep_partcp_fut_cnt() {
		return rtd_sep_partcp_fut_cnt;
	}
	/**
	 * @param rtd_sep_partcp_fut_cnt the rtd_sep_partcp_fut_cnt to set
	 */
	public void setRtd_sep_partcp_fut_cnt(String rtd_sep_partcp_fut_cnt) {
		this.rtd_sep_partcp_fut_cnt = rtd_sep_partcp_fut_cnt;
	}
	/**
	 * @return the subtl_act_rtd_sep_cnt
	 */
	public String getSubtl_act_rtd_sep_cnt() {
		return subtl_act_rtd_sep_cnt;
	}
	/**
	 * @param subtl_act_rtd_sep_cnt the subtl_act_rtd_sep_cnt to set
	 */
	public void setSubtl_act_rtd_sep_cnt(String subtl_act_rtd_sep_cnt) {
		this.subtl_act_rtd_sep_cnt = subtl_act_rtd_sep_cnt;
	}
	/**
	 * @return the benef_rcvg_bnft_cnt
	 */
	public String getBenef_rcvg_bnft_cnt() {
		return benef_rcvg_bnft_cnt;
	}
	/**
	 * @param benef_rcvg_bnft_cnt the benef_rcvg_bnft_cnt to set
	 */
	public void setBenef_rcvg_bnft_cnt(String benef_rcvg_bnft_cnt) {
		this.benef_rcvg_bnft_cnt = benef_rcvg_bnft_cnt;
	}
	/**
	 * @return the tot_act_rtd_sep_benef_cnt
	 */
	public String getTot_act_rtd_sep_benef_cnt() {
		return tot_act_rtd_sep_benef_cnt;
	}
	/**
	 * @param tot_act_rtd_sep_benef_cnt the tot_act_rtd_sep_benef_cnt to set
	 */
	public void setTot_act_rtd_sep_benef_cnt(String tot_act_rtd_sep_benef_cnt) {
		this.tot_act_rtd_sep_benef_cnt = tot_act_rtd_sep_benef_cnt;
	}
	/**
	 * @return the partcp_account_bal_cnt
	 */
	public String getPartcp_account_bal_cnt() {
		return partcp_account_bal_cnt;
	}
	/**
	 * @param partcp_account_bal_cnt the partcp_account_bal_cnt to set
	 */
	public void setPartcp_account_bal_cnt(String partcp_account_bal_cnt) {
		this.partcp_account_bal_cnt = partcp_account_bal_cnt;
	}
	/**
	 * @return the sep_partcp_partl_vstd_cnt
	 */
	public String getSep_partcp_partl_vstd_cnt() {
		return sep_partcp_partl_vstd_cnt;
	}
	/**
	 * @param sep_partcp_partl_vstd_cnt the sep_partcp_partl_vstd_cnt to set
	 */
	public void setSep_partcp_partl_vstd_cnt(String sep_partcp_partl_vstd_cnt) {
		this.sep_partcp_partl_vstd_cnt = sep_partcp_partl_vstd_cnt;
	}
	/**
	 * @return the contrib_emplrs_cnt
	 */
	public String getContrib_emplrs_cnt() {
		return contrib_emplrs_cnt;
	}
	/**
	 * @param contrib_emplrs_cnt the contrib_emplrs_cnt to set
	 */
	public void setContrib_emplrs_cnt(String contrib_emplrs_cnt) {
		this.contrib_emplrs_cnt = contrib_emplrs_cnt;
	}
	/**
	 * @return the type_pension_bnft_code
	 */
	public String getType_pension_bnft_code() {
		return type_pension_bnft_code;
	}
	/**
	 * @param type_pension_bnft_code the type_pension_bnft_code to set
	 */
	public void setType_pension_bnft_code(String type_pension_bnft_code) {
		this.type_pension_bnft_code = type_pension_bnft_code;
	}
	/**
	 * @return the type_welfare_bnft_code
	 */
	public String getType_welfare_bnft_code() {
		return type_welfare_bnft_code;
	}
	/**
	 * @param type_welfare_bnft_code the type_welfare_bnft_code to set
	 */
	public void setType_welfare_bnft_code(String type_welfare_bnft_code) {
		this.type_welfare_bnft_code = type_welfare_bnft_code;
	}
	/**
	 * @return the funding_insurance_ind
	 */
	public String getFunding_insurance_ind() {
		return funding_insurance_ind;
	}
	/**
	 * @param funding_insurance_ind the funding_insurance_ind to set
	 */
	public void setFunding_insurance_ind(String funding_insurance_ind) {
		this.funding_insurance_ind = funding_insurance_ind;
	}
	/**
	 * @return the funding_sec412_ind
	 */
	public String getFunding_sec412_ind() {
		return funding_sec412_ind;
	}
	/**
	 * @param funding_sec412_ind the funding_sec412_ind to set
	 */
	public void setFunding_sec412_ind(String funding_sec412_ind) {
		this.funding_sec412_ind = funding_sec412_ind;
	}
	/**
	 * @return the funding_trust_ind
	 */
	public String getFunding_trust_ind() {
		return funding_trust_ind;
	}
	/**
	 * @param funding_trust_ind the funding_trust_ind to set
	 */
	public void setFunding_trust_ind(String funding_trust_ind) {
		this.funding_trust_ind = funding_trust_ind;
	}
	/**
	 * @return the funding_gen_asset_ind
	 */
	public String getFunding_gen_asset_ind() {
		return funding_gen_asset_ind;
	}
	/**
	 * @param funding_gen_asset_ind the funding_gen_asset_ind to set
	 */
	public void setFunding_gen_asset_ind(String funding_gen_asset_ind) {
		this.funding_gen_asset_ind = funding_gen_asset_ind;
	}
	/**
	 * @return the benefit_insurance_ind
	 */
	public String getBenefit_insurance_ind() {
		return benefit_insurance_ind;
	}
	/**
	 * @param benefit_insurance_ind the benefit_insurance_ind to set
	 */
	public void setBenefit_insurance_ind(String benefit_insurance_ind) {
		this.benefit_insurance_ind = benefit_insurance_ind;
	}
	/**
	 * @return the benefit_sec412_ind
	 */
	public String getBenefit_sec412_ind() {
		return benefit_sec412_ind;
	}
	/**
	 * @param benefit_sec412_ind the benefit_sec412_ind to set
	 */
	public void setBenefit_sec412_ind(String benefit_sec412_ind) {
		this.benefit_sec412_ind = benefit_sec412_ind;
	}
	/**
	 * @return the benefit_trust_ind
	 */
	public String getBenefit_trust_ind() {
		return benefit_trust_ind;
	}
	/**
	 * @param benefit_trust_ind the benefit_trust_ind to set
	 */
	public void setBenefit_trust_ind(String benefit_trust_ind) {
		this.benefit_trust_ind = benefit_trust_ind;
	}
	/**
	 * @return the benefit_gen_asset_ind
	 */
	public String getBenefit_gen_asset_ind() {
		return benefit_gen_asset_ind;
	}
	/**
	 * @param benefit_gen_asset_ind the benefit_gen_asset_ind to set
	 */
	public void setBenefit_gen_asset_ind(String benefit_gen_asset_ind) {
		this.benefit_gen_asset_ind = benefit_gen_asset_ind;
	}
	/**
	 * @return the sch_r_attached_ind
	 */
	public String getSch_r_attached_ind() {
		return sch_r_attached_ind;
	}
	/**
	 * @param sch_r_attached_ind the sch_r_attached_ind to set
	 */
	public void setSch_r_attached_ind(String sch_r_attached_ind) {
		this.sch_r_attached_ind = sch_r_attached_ind;
	}
	/**
	 * @return the sch_mb_attached_ind
	 */
	public String getSch_mb_attached_ind() {
		return sch_mb_attached_ind;
	}
	/**
	 * @param sch_mb_attached_ind the sch_mb_attached_ind to set
	 */
	public void setSch_mb_attached_ind(String sch_mb_attached_ind) {
		this.sch_mb_attached_ind = sch_mb_attached_ind;
	}
	/**
	 * @return the sch_sb_attached_ind
	 */
	public String getSch_sb_attached_ind() {
		return sch_sb_attached_ind;
	}
	/**
	 * @param sch_sb_attached_ind the sch_sb_attached_ind to set
	 */
	public void setSch_sb_attached_ind(String sch_sb_attached_ind) {
		this.sch_sb_attached_ind = sch_sb_attached_ind;
	}
	/**
	 * @return the sch_h_attached_ind
	 */
	public String getSch_h_attached_ind() {
		return sch_h_attached_ind;
	}
	/**
	 * @param sch_h_attached_ind the sch_h_attached_ind to set
	 */
	public void setSch_h_attached_ind(String sch_h_attached_ind) {
		this.sch_h_attached_ind = sch_h_attached_ind;
	}
	/**
	 * @return the sch_i_attached_ind
	 */
	public String getSch_i_attached_ind() {
		return sch_i_attached_ind;
	}
	/**
	 * @param sch_i_attached_ind the sch_i_attached_ind to set
	 */
	public void setSch_i_attached_ind(String sch_i_attached_ind) {
		this.sch_i_attached_ind = sch_i_attached_ind;
	}
	/**
	 * @return the sch_a_attached_ind
	 */
	public String getSch_a_attached_ind() {
		return sch_a_attached_ind;
	}
	/**
	 * @param sch_a_attached_ind the sch_a_attached_ind to set
	 */
	public void setSch_a_attached_ind(String sch_a_attached_ind) {
		this.sch_a_attached_ind = sch_a_attached_ind;
	}
	/**
	 * @return the num_sch_a_attached_cnt
	 */
	public String getNum_sch_a_attached_cnt() {
		return num_sch_a_attached_cnt;
	}
	/**
	 * @param num_sch_a_attached_cnt the num_sch_a_attached_cnt to set
	 */
	public void setNum_sch_a_attached_cnt(String num_sch_a_attached_cnt) {
		this.num_sch_a_attached_cnt = num_sch_a_attached_cnt;
	}
	/**
	 * @return the sch_c_attached_ind
	 */
	public String getSch_c_attached_ind() {
		return sch_c_attached_ind;
	}
	/**
	 * @param sch_c_attached_ind the sch_c_attached_ind to set
	 */
	public void setSch_c_attached_ind(String sch_c_attached_ind) {
		this.sch_c_attached_ind = sch_c_attached_ind;
	}
	/**
	 * @return the sch_d_attached_ind
	 */
	public String getSch_d_attached_ind() {
		return sch_d_attached_ind;
	}
	/**
	 * @param sch_d_attached_ind the sch_d_attached_ind to set
	 */
	public void setSch_d_attached_ind(String sch_d_attached_ind) {
		this.sch_d_attached_ind = sch_d_attached_ind;
	}
	/**
	 * @return the sch_g_attached_ind
	 */
	public String getSch_g_attached_ind() {
		return sch_g_attached_ind;
	}
	/**
	 * @param sch_g_attached_ind the sch_g_attached_ind to set
	 */
	public void setSch_g_attached_ind(String sch_g_attached_ind) {
		this.sch_g_attached_ind = sch_g_attached_ind;
	}
	/**
	 * @return the filing_status
	 */
	public String getFiling_status() {
		return filing_status;
	}
	/**
	 * @param filing_status the filing_status to set
	 */
	public void setFiling_status(String filing_status) {
		this.filing_status = filing_status;
	}
	/**
	 * @return the date_received
	 */
	public String getDate_received() {
		return date_received;
	}
	/**
	 * @param date_received the date_received to set
	 */
	public void setDate_received(String date_received) {
		this.date_received = date_received;
	}
	/**
	 * @return the valid_admin_signature
	 */
	public String getValid_admin_signature() {
		return valid_admin_signature;
	}
	/**
	 * @param valid_admin_signature the valid_admin_signature to set
	 */
	public void setValid_admin_signature(String valid_admin_signature) {
		this.valid_admin_signature = valid_admin_signature;
	}
	/**
	 * @return the valid_dfe_signature
	 */
	public String getValid_dfe_signature() {
		return valid_dfe_signature;
	}
	/**
	 * @param valid_dfe_signature the valid_dfe_signature to set
	 */
	public void setValid_dfe_signature(String valid_dfe_signature) {
		this.valid_dfe_signature = valid_dfe_signature;
	}
	/**
	 * @return the valid_sponsor_signature
	 */
	public String getValid_sponsor_signature() {
		return valid_sponsor_signature;
	}
	/**
	 * @param valid_sponsor_signature the valid_sponsor_signature to set
	 */
	public void setValid_sponsor_signature(String valid_sponsor_signature) {
		this.valid_sponsor_signature = valid_sponsor_signature;
	}
	/**
	 * @return the admin_phone_num_foreign
	 */
	public String getAdmin_phone_num_foreign() {
		return admin_phone_num_foreign;
	}
	/**
	 * @param admin_phone_num_foreign the admin_phone_num_foreign to set
	 */
	public void setAdmin_phone_num_foreign(String admin_phone_num_foreign) {
		this.admin_phone_num_foreign = admin_phone_num_foreign;
	}
	/**
	 * @return the spons_dfe_phone_num_foreign
	 */
	public String getSpons_dfe_phone_num_foreign() {
		return spons_dfe_phone_num_foreign;
	}
	/**
	 * @param spons_dfe_phone_num_foreign the spons_dfe_phone_num_foreign to set
	 */
	public void setSpons_dfe_phone_num_foreign(String spons_dfe_phone_num_foreign) {
		this.spons_dfe_phone_num_foreign = spons_dfe_phone_num_foreign;
	}
	/**
	 * @return the admin_name_same_spon_ind
	 */
	public String getAdmin_name_same_spon_ind() {
		return admin_name_same_spon_ind;
	}
	/**
	 * @param admin_name_same_spon_ind the admin_name_same_spon_ind to set
	 */
	public void setAdmin_name_same_spon_ind(String admin_name_same_spon_ind) {
		this.admin_name_same_spon_ind = admin_name_same_spon_ind;
	}
	/**
	 * @return the admin_address_same_spon_ind
	 */
	public String getAdmin_address_same_spon_ind() {
		return admin_address_same_spon_ind;
	}
	/**
	 * @param admin_address_same_spon_ind the admin_address_same_spon_ind to set
	 */
	public void setAdmin_address_same_spon_ind(String admin_address_same_spon_ind) {
		this.admin_address_same_spon_ind = admin_address_same_spon_ind;
	}
	/**
	 * @return the preparer_name
	 */
	public String getPreparer_name() {
		return preparer_name;
	}
	/**
	 * @param preparer_name the preparer_name to set
	 */
	public void setPreparer_name(String preparer_name) {
		this.preparer_name = preparer_name;
	}
	/**
	 * @return the preparer_firm_name
	 */
	public String getPreparer_firm_name() {
		return preparer_firm_name;
	}
	/**
	 * @param preparer_firm_name the preparer_firm_name to set
	 */
	public void setPreparer_firm_name(String preparer_firm_name) {
		this.preparer_firm_name = preparer_firm_name;
	}
	/**
	 * @return the preparer_us_address1
	 */
	public String getPreparer_us_address1() {
		return preparer_us_address1;
	}
	/**
	 * @param preparer_us_address1 the preparer_us_address1 to set
	 */
	public void setPreparer_us_address1(String preparer_us_address1) {
		this.preparer_us_address1 = preparer_us_address1;
	}
	/**
	 * @return the preparer_us_address2
	 */
	public String getPreparer_us_address2() {
		return preparer_us_address2;
	}
	/**
	 * @param preparer_us_address2 the preparer_us_address2 to set
	 */
	public void setPreparer_us_address2(String preparer_us_address2) {
		this.preparer_us_address2 = preparer_us_address2;
	}
	/**
	 * @return the preparer_us_city
	 */
	public String getPreparer_us_city() {
		return preparer_us_city;
	}
	/**
	 * @param preparer_us_city the preparer_us_city to set
	 */
	public void setPreparer_us_city(String preparer_us_city) {
		this.preparer_us_city = preparer_us_city;
	}
	/**
	 * @return the preparer_us_state
	 */
	public String getPreparer_us_state() {
		return preparer_us_state;
	}
	/**
	 * @param preparer_us_state the preparer_us_state to set
	 */
	public void setPreparer_us_state(String preparer_us_state) {
		this.preparer_us_state = preparer_us_state;
	}
	/**
	 * @return the preparer_us_zip
	 */
	public String getPreparer_us_zip() {
		return preparer_us_zip;
	}
	/**
	 * @param preparer_us_zip the preparer_us_zip to set
	 */
	public void setPreparer_us_zip(String preparer_us_zip) {
		this.preparer_us_zip = preparer_us_zip;
	}
	/**
	 * @return the preparer_foreign_address1
	 */
	public String getPreparer_foreign_address1() {
		return preparer_foreign_address1;
	}
	/**
	 * @param preparer_foreign_address1 the preparer_foreign_address1 to set
	 */
	public void setPreparer_foreign_address1(String preparer_foreign_address1) {
		this.preparer_foreign_address1 = preparer_foreign_address1;
	}
	/**
	 * @return the preparer_foreign_address2
	 */
	public String getPreparer_foreign_address2() {
		return preparer_foreign_address2;
	}
	/**
	 * @param preparer_foreign_address2 the preparer_foreign_address2 to set
	 */
	public void setPreparer_foreign_address2(String preparer_foreign_address2) {
		this.preparer_foreign_address2 = preparer_foreign_address2;
	}
	/**
	 * @return the preparer_foreign_city
	 */
	public String getPreparer_foreign_city() {
		return preparer_foreign_city;
	}
	/**
	 * @param preparer_foreign_city the preparer_foreign_city to set
	 */
	public void setPreparer_foreign_city(String preparer_foreign_city) {
		this.preparer_foreign_city = preparer_foreign_city;
	}
	/**
	 * @return the preparer_foreign_prov_state
	 */
	public String getPreparer_foreign_prov_state() {
		return preparer_foreign_prov_state;
	}
	/**
	 * @param preparer_foreign_prov_state the preparer_foreign_prov_state to set
	 */
	public void setPreparer_foreign_prov_state(String preparer_foreign_prov_state) {
		this.preparer_foreign_prov_state = preparer_foreign_prov_state;
	}
	/**
	 * @return the preparer_foreign_cntry
	 */
	public String getPreparer_foreign_cntry() {
		return preparer_foreign_cntry;
	}
	/**
	 * @param preparer_foreign_cntry the preparer_foreign_cntry to set
	 */
	public void setPreparer_foreign_cntry(String preparer_foreign_cntry) {
		this.preparer_foreign_cntry = preparer_foreign_cntry;
	}
	/**
	 * @return the preparer_foreign_postal_cd
	 */
	public String getPreparer_foreign_postal_cd() {
		return preparer_foreign_postal_cd;
	}
	/**
	 * @param preparer_foreign_postal_cd the preparer_foreign_postal_cd to set
	 */
	public void setPreparer_foreign_postal_cd(String preparer_foreign_postal_cd) {
		this.preparer_foreign_postal_cd = preparer_foreign_postal_cd;
	}
	/**
	 * @return the preparer_phone_num
	 */
	public String getPreparer_phone_num() {
		return preparer_phone_num;
	}
	/**
	 * @param preparer_phone_num the preparer_phone_num to set
	 */
	public void setPreparer_phone_num(String preparer_phone_num) {
		this.preparer_phone_num = preparer_phone_num;
	}
	/**
	 * @return the preparer_phone_num_foreign
	 */
	public String getPreparer_phone_num_foreign() {
		return preparer_phone_num_foreign;
	}
	/**
	 * @param preparer_phone_num_foreign the preparer_phone_num_foreign to set
	 */
	public void setPreparer_phone_num_foreign(String preparer_phone_num_foreign) {
		this.preparer_phone_num_foreign = preparer_phone_num_foreign;
	}
	/**
	 * @return the tot_act_partcp_boy_cnt
	 */
	public String getTot_act_partcp_boy_cnt() {
		return tot_act_partcp_boy_cnt;
	}
	/**
	 * @param tot_act_partcp_boy_cnt the tot_act_partcp_boy_cnt to set
	 */
	public void setTot_act_partcp_boy_cnt(String tot_act_partcp_boy_cnt) {
		this.tot_act_partcp_boy_cnt = tot_act_partcp_boy_cnt;
	}
	/**
	 * @return the subj_m1_filing_req_ind
	 */
	public String getSubj_m1_filing_req_ind() {
		return subj_m1_filing_req_ind;
	}
	/**
	 * @param subj_m1_filing_req_ind the subj_m1_filing_req_ind to set
	 */
	public void setSubj_m1_filing_req_ind(String subj_m1_filing_req_ind) {
		this.subj_m1_filing_req_ind = subj_m1_filing_req_ind;
	}
	/**
	 * @return the compliance_m1_filing_req_ind
	 */
	public String getCompliance_m1_filing_req_ind() {
		return compliance_m1_filing_req_ind;
	}
	/**
	 * @param compliance_m1_filing_req_ind the compliance_m1_filing_req_ind to set
	 */
	public void setCompliance_m1_filing_req_ind(String compliance_m1_filing_req_ind) {
		this.compliance_m1_filing_req_ind = compliance_m1_filing_req_ind;
	}
	/**
	 * @return the m1_receipt_confirmation_code
	 */
	public String getM1_receipt_confirmation_code() {
		return m1_receipt_confirmation_code;
	}
	/**
	 * @param m1_receipt_confirmation_code the m1_receipt_confirmation_code to set
	 */
	public void setM1_receipt_confirmation_code(String m1_receipt_confirmation_code) {
		this.m1_receipt_confirmation_code = m1_receipt_confirmation_code;
	}
	/**
	 * @return the admin_manual_signed_date
	 */
	public String getAdmin_manual_signed_date() {
		return admin_manual_signed_date;
	}
	/**
	 * @param admin_manual_signed_date the admin_manual_signed_date to set
	 */
	public void setAdmin_manual_signed_date(String admin_manual_signed_date) {
		this.admin_manual_signed_date = admin_manual_signed_date;
	}
	/**
	 * @return the admin_manual_signed_name
	 */
	public String getAdmin_manual_signed_name() {
		return admin_manual_signed_name;
	}
	/**
	 * @param admin_manual_signed_name the admin_manual_signed_name to set
	 */
	public void setAdmin_manual_signed_name(String admin_manual_signed_name) {
		this.admin_manual_signed_name = admin_manual_signed_name;
	}
	/**
	 * @return the last_rpt_plan_name
	 */
	public String getLast_rpt_plan_name() {
		return last_rpt_plan_name;
	}
	/**
	 * @param last_rpt_plan_name the last_rpt_plan_name to set
	 */
	public void setLast_rpt_plan_name(String last_rpt_plan_name) {
		this.last_rpt_plan_name = last_rpt_plan_name;
	}
	/**
	 * @return the spons_manual_signed_date
	 */
	public String getSpons_manual_signed_date() {
		return spons_manual_signed_date;
	}
	/**
	 * @param spons_manual_signed_date the spons_manual_signed_date to set
	 */
	public void setSpons_manual_signed_date(String spons_manual_signed_date) {
		this.spons_manual_signed_date = spons_manual_signed_date;
	}
	/**
	 * @return the spons_manual_signed_name
	 */
	public String getSpons_manual_signed_name() {
		return spons_manual_signed_name;
	}
	/**
	 * @param spons_manual_signed_name the spons_manual_signed_name to set
	 */
	public void setSpons_manual_signed_name(String spons_manual_signed_name) {
		this.spons_manual_signed_name = spons_manual_signed_name;
	}
	/**
	 * @return the dfe_manual_signed_date
	 */
	public String getDfe_manual_signed_date() {
		return dfe_manual_signed_date;
	}
	/**
	 * @param dfe_manual_signed_date the dfe_manual_signed_date to set
	 */
	public void setDfe_manual_signed_date(String dfe_manual_signed_date) {
		this.dfe_manual_signed_date = dfe_manual_signed_date;
	}
	/**
	 * @return the dfe_manual_signed_name
	 */
	public String getDfe_manual_signed_name() {
		return dfe_manual_signed_name;
	}
	/**
	 * @param dfe_manual_signed_name the dfe_manual_signed_name to set
	 */
	public void setDfe_manual_signed_name(String dfe_manual_signed_name) {
		this.dfe_manual_signed_name = dfe_manual_signed_name;
	}
	
	
}
