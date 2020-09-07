package com.x.processplatform.core.entity.log;

import java.util.Date;
import java.util.List;

import com.x.base.core.project.gson.GsonPropertyObject;

public class Signal extends GsonPropertyObject {

//	public static final String TYPE_AGENTARRIVE = "agentArrive";
//	public static final String TYPE_AGENTEXECUTE = "agentExecute";
//	public static final String TYPE_AGENTINQUIRE = "agentInquire";

	private AgentArrive agentArrive;
	private AgentExecute agentExecute;
	private AgentInquire agentInquire;

	public AgentArrive getAgentArrive() {
		return agentArrive;
	}

	public AgentExecute getAgentExecute() {
		return agentExecute;
	}

	public AgentInquire getAgentInquire() {
		return agentInquire;
	}

	public static class AgentArrive extends Base {

	}

	public static Signal agentArrive(String activityToken) {
		Signal p = new Signal();
		p.activityToken = activityToken;
		AgentArrive s = new AgentArrive();
		p.agentArrive = s;
		return p;
	}

	public static class AgentExecute extends Base {

	}

	public static Signal agentExecute(String activityToken) {
		Signal p = new Signal();
		AgentExecute s = new AgentExecute();
		p.agentExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class AgentInquire extends Base {

	}

	public static Signal agentInquire(String activityToken) {
		Signal p = new Signal();
		AgentInquire s = new AgentInquire();
		p.agentInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_BEGINARRIVE = "beginArrive";
//	public static final String TYPE_BEGINEXECUTE = "beginExecute";
//	public static final String TYPE_BEGININQUIRE = "beginInquire";

	private BeginArrive beginArrive;
	private BeginExecute beginExecute;
	private BeginInquire beginInquire;

	public BeginArrive getBeginArrive() {
		return beginArrive;
	}

	public BeginExecute getBeginExecute() {
		return beginExecute;
	}

	public BeginInquire getBeginInquire() {
		return beginInquire;
	}

	public static class BeginArrive extends Base {

	}

	public static Signal beginArrive(String activityToken) {
		Signal p = new Signal();
		BeginArrive s = new BeginArrive();
		p.beginArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class BeginExecute extends Base {

	}

	public static Signal beginExecute(String activityToken) {
		Signal p = new Signal();
		BeginExecute s = new BeginExecute();
		p.beginExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class BeginInquire extends Base {

	}

	public static Signal beginInquire(String activityToken) {
		Signal p = new Signal();
		BeginInquire s = new BeginInquire();
		p.beginInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_CANCELARRIVE = "cancelArrive";
//	public static final String TYPE_CANCELEXECUTE = "cancelExecute";
//	public static final String TYPE_CANCELINQUIRE = "cancelInquire";

	private CancelArrive cancelArrive;
	private CancelExecute cancelExecute;
	private CancelInquire cancelInquire;

	public CancelArrive getCancelArrive() {
		return cancelArrive;
	}

	public CancelExecute getCancelExecute() {
		return cancelExecute;
	}

	public CancelInquire getCancelInquire() {
		return cancelInquire;
	}

	public static class CancelArrive extends Base {

	}

	public static Signal cancelArrive(String activityToken) {
		Signal p = new Signal();
		CancelArrive s = new CancelArrive();
		p.cancelArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class CancelExecute extends Base {

	}

	public static Signal cancelExecute(String activityToken) {
		Signal p = new Signal();
		CancelExecute s = new CancelExecute();
		p.cancelExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class CancelInquire extends Base {

	}

	public static Signal cancelInquire(String activityToken) {
		Signal p = new Signal();
		CancelInquire s = new CancelInquire();
		p.cancelInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_CHOICEARRIVE = "choiceArrive";
//	public static final String TYPE_CHOICEEXECUTE = "choiceExecute";
//	public static final String TYPE_CHOICEINQUIRE = "choiceInquire";

	private ChoiceArrive choiceArrive;
	private ChoiceExecute choiceExecute;
	private ChoiceInquire choiceInquire;

	public ChoiceArrive getChoiceArrive() {
		return choiceArrive;
	}

	public ChoiceExecute getChoiceExecute() {
		return choiceExecute;
	}

	public ChoiceInquire getChoiceInquire() {
		return choiceInquire;
	}

	public static class ChoiceArrive extends Base {

	}

	public static Signal choiceArrive(String activityToken) {
		Signal p = new Signal();
		ChoiceArrive s = new ChoiceArrive();
		p.choiceArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ChoiceExecute extends Base {

	}

	public static Signal choiceExecute(String activityToken) {
		Signal p = new Signal();
		ChoiceExecute s = new ChoiceExecute();
		p.choiceExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ChoiceInquire extends Base {

	}

	public static Signal choiceInquire(String activityToken) {
		Signal p = new Signal();
		ChoiceInquire s = new ChoiceInquire();
		p.choiceInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_DELAYARRIVE = "delayArrive";
//	public static final String TYPE_DELAYEXECUTE = "delayExecute";
//	public static final String TYPE_DELAYINQUIRE = "delayInquire";

	private DelayArrive delayArrive;
	private DelayExecute delayExecute;
	private DelayInquire delayInquire;

	public DelayArrive getDelayArrive() {
		return delayArrive;
	}

	public DelayExecute getDelayExecute() {
		return delayExecute;
	}

	public DelayInquire getDelayInquire() {
		return delayInquire;
	}

	public static class DelayArrive extends Base {

	}

	public static Signal delayArrive(String activityToken) {
		Signal p = new Signal();
		DelayArrive s = new DelayArrive();
		p.delayArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class DelayExecute extends Base {

	}

	public static Signal delayExecute(String activityToken) {
		Signal p = new Signal();
		DelayExecute s = new DelayExecute();
		p.delayExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class DelayInquire extends Base {

	}

	public static Signal delayInquire(String activityToken) {
		Signal p = new Signal();
		DelayInquire s = new DelayInquire();
		p.delayInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_EMBEDARRIVE = "embedArrive";
//	public static final String TYPE_EMBEDEXECUTE = "embedExecute";
//	public static final String TYPE_EMBEDINQUIRE = "embedInquire";

	private EmbedArrive embedArrive;
	private EmbedExecute embedExecute;
	private EmbedInquire embedInquire;

	public EmbedArrive getEmbedArrive() {
		return embedArrive;
	}

	public EmbedExecute getEmbedExecute() {
		return embedExecute;
	}

	public EmbedInquire getEmbedInquire() {
		return embedInquire;
	}

	public static class EmbedArrive extends Base {

	}

	public static Signal embedArrive(String activityToken) {
		Signal p = new Signal();
		EmbedArrive s = new EmbedArrive();
		p.embedArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class EmbedExecute extends Base {

	}

	public static Signal embedExecute(String activityToken) {
		Signal p = new Signal();
		EmbedExecute s = new EmbedExecute();
		p.embedExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class EmbedInquire extends Base {

	}

	public static Signal embedInquire(String activityToken) {
		Signal p = new Signal();
		EmbedInquire s = new EmbedInquire();
		p.embedInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_ENDARRIVE = "endArrive";
//	public static final String TYPE_ENDEXECUTE = "endExecute";
//	public static final String TYPE_ENDINQUIRE = "endInquire";

	private EndArrive endArrive;
	private EndExecute endExecute;
	private EndInquire endInquire;

	public EndArrive getEndArrive() {
		return endArrive;
	}

	public EndExecute getEndExecute() {
		return endExecute;
	}

	public EndInquire getEndInquire() {
		return endInquire;
	}

	public static class EndArrive extends Base {

	}

	public static Signal endArrive(String activityToken) {
		Signal p = new Signal();
		EndArrive s = new EndArrive();
		p.endArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class EndExecute extends Base {

	}

	public static Signal endExecute(String activityToken) {
		Signal p = new Signal();
		EndExecute s = new EndExecute();
		p.endExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class EndInquire extends Base {

	}

	public static Signal endInquire(String activityToken) {
		Signal p = new Signal();
		EndInquire s = new EndInquire();
		p.endInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_INVOKEARRIVE = "invokeArrive";
//	public static final String TYPE_INVOKEEXECUTE = "invokeExecute";
//	public static final String TYPE_INVOKEINQUIRE = "invokeInquire";

	private InvokeArrive invokeArrive;
	private InvokeExecute invokeExecute;
	private InvokeInquire invokeInquire;

	public InvokeArrive getInvokeArrive() {
		return invokeArrive;
	}

	public InvokeExecute getInvokeExecute() {
		return invokeExecute;
	}

	public InvokeInquire getInvokeInquire() {
		return invokeInquire;
	}

	public static class InvokeArrive extends Base {

	}

	public static Signal invokeArrive(String activityToken) {
		Signal p = new Signal();
		InvokeArrive s = new InvokeArrive();
		p.invokeArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class InvokeExecute extends Base {

	}

	public static Signal invokeExecute(String activityToken) {
		Signal p = new Signal();
		InvokeExecute s = new InvokeExecute();
		p.invokeExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class InvokeInquire extends Base {

	}

	public static Signal invokeInquire(String activityToken) {
		Signal p = new Signal();
		InvokeInquire s = new InvokeInquire();
		p.invokeInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_MANUALARRIVE = "manualArrive";
//	public static final String TYPE_MANUALEXECUTE = "manualExecute";
//	public static final String TYPE_MANUALINQUIRE = "manualInquire";

	private ManualArrive manualArrive;
	private ManualExecute manualExecute;
	private ManualInquire manualInquire;

	public ManualArrive getManualArrive() {
		return manualArrive;
	}

	public ManualExecute getManualExecute() {
		return manualExecute;
	}

	public ManualInquire getManualInquire() {
		return manualInquire;
	}

	public static class ManualArrive extends Base {

	}

	public static Signal manualArrive(String activityToken) {
		Signal p = new Signal();
		ManualArrive s = new ManualArrive();
		p.manualArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ManualExecute extends Base {

		private String type;
		private List<String> identities;

		public String getType() {
			return type;
		}

		public List<String> getIdentities() {
			return identities;
		}

	}

	public static Signal manualExecute(String activityToken, String type, List<String> identities) {
		Signal p = new Signal();
		ManualExecute s = new ManualExecute();
		s.type = type;
		s.identities = identities;
		p.manualExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ManualInquire extends Base {

	}

	public static Signal manualInquire(String activityToken) {
		Signal p = new Signal();
		ManualInquire s = new ManualInquire();
		p.manualInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_MERGEARRIVE = "mergeArrive";
//	public static final String TYPE_MERGEEXECUTE = "mergeExecute";
//	public static final String TYPE_MERGEINQUIRE = "mergeInquire";

	private MergeArrive mergeArrive;
	private MergeExecute mergeExecute;
	private MergeInquire mergeInquire;

	public MergeArrive getMergeArrive() {
		return mergeArrive;
	}

	public MergeExecute getMergeExecute() {
		return mergeExecute;
	}

	public MergeInquire getMergeInquire() {
		return mergeInquire;
	}

	public static class MergeArrive extends Base {

	}

	public static Signal mergeArrive(String activityToken) {
		Signal p = new Signal();
		MergeArrive s = new MergeArrive();
		p.mergeArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class MergeExecute extends Base {

	}

	public static Signal mergeExecute(String activityToken) {
		Signal p = new Signal();
		MergeExecute s = new MergeExecute();
		p.mergeExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class MergeInquire extends Base {

	}

	public static Signal mergeInquire(String activityToken) {
		Signal p = new Signal();
		MergeInquire s = new MergeInquire();
		p.mergeInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_MESSAGEARRIVE = "messageArrive";
//	public static final String TYPE_MESSAGEEXECUTE = "messageExecute";
//	public static final String TYPE_MESSAGEINQUIRE = "messageInquire";

	private MessageArrive messageArrive;
	private MessageExecute messageExecute;
	private MessageInquire messageInquire;

	public MessageArrive getMessageArrive() {
		return messageArrive;
	}

	public MessageExecute getMessageExecute() {
		return messageExecute;
	}

	public MessageInquire getMessageInquire() {
		return messageInquire;
	}

	public static class MessageArrive extends Base {

	}

	public static Signal messageArrive(String activityToken) {
		Signal p = new Signal();
		MessageArrive s = new MessageArrive();
		p.messageArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class MessageExecute extends Base {

	}

	public static Signal messageExecute(String activityToken) {
		Signal p = new Signal();
		MessageExecute s = new MessageExecute();
		p.messageExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class MessageInquire extends Base {

	}

	public static Signal messageInquire(String activityToken) {
		Signal p = new Signal();
		MessageInquire s = new MessageInquire();
		p.messageInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_PARALLELARRIVE = "parallelArrive";
//	public static final String TYPE_PARALLELEXECUTE = "parallelExecute";
//	public static final String TYPE_PARALLELINQUIRE = "parallelInquire";

	private ParallelArrive parallelArrive;
	private ParallelExecute parallelExecute;
	private ParallelInquire parallelInquire;

	public ParallelArrive getParallelArrive() {
		return parallelArrive;
	}

	public ParallelExecute getParallelExecute() {
		return parallelExecute;
	}

	public ParallelInquire getParallelInquire() {
		return parallelInquire;
	}

	public static class ParallelArrive extends Base {

	}

	public static Signal parallelArrive(String activityToken) {
		Signal p = new Signal();
		ParallelArrive s = new ParallelArrive();
		p.parallelArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ParallelExecute extends Base {

	}

	public static Signal parallelExecute(String activityToken) {
		Signal p = new Signal();
		ParallelExecute s = new ParallelExecute();
		p.parallelExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ParallelInquire extends Base {

	}

	public static Signal parallelInquire(String activityToken) {
		Signal p = new Signal();
		ParallelInquire s = new ParallelInquire();
		p.parallelInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_SERVICEARRIVE = "serviceArrive";
//	public static final String TYPE_SERVICEEXECUTE = "serviceExecute";
//	public static final String TYPE_SERVICEINQUIRE = "serviceInquire";

	private ServiceArrive serviceArrive;
	private ServiceExecute serviceExecute;
	private ServiceInquire serviceInquire;

	public ServiceArrive getServiceArrive() {
		return serviceArrive;
	}

	public ServiceExecute getServiceExecute() {
		return serviceExecute;
	}

	public ServiceInquire getServiceInquire() {
		return serviceInquire;
	}

	public static class ServiceArrive extends Base {

	}

	public static Signal serviceArrive(String activityToken) {
		Signal p = new Signal();
		ServiceArrive s = new ServiceArrive();
		p.serviceArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ServiceExecute extends Base {

	}

	public static Signal serviceExecute(String activityToken) {
		Signal p = new Signal();
		ServiceExecute s = new ServiceExecute();
		p.serviceExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class ServiceInquire extends Base {

	}

	public static Signal serviceInquire(String activityToken) {
		Signal p = new Signal();
		ServiceInquire s = new ServiceInquire();
		p.serviceInquire = s;
		p.activityToken = activityToken;
		return p;
	}

//	public static final String TYPE_SPLITARRIVE = "splitArrive";
//	public static final String TYPE_SPLITEXECUTE = "splitExecute";
//	public static final String TYPE_SPLITINQUIRE = "splitInquire";

	private SplitArrive splitArrive;
	private SplitExecute splitExecute;
	private SplitInquire splitInquire;

	public SplitArrive getSplitArrive() {
		return splitArrive;
	}

	public SplitExecute getSplitExecute() {
		return splitExecute;
	}

	public SplitInquire getSplitInquire() {
		return splitInquire;
	}

	public static class SplitArrive extends Base {

	}

	public static Signal splitArrive(String activityToken) {
		Signal p = new Signal();
		SplitArrive s = new SplitArrive();
		p.splitArrive = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class SplitExecute extends Base {

		List<String> splitValueList;

		public List<String> getSplitValueList() {
			return splitValueList;
		}

	}

	public static Signal splitExecute(String activityToken, List<String> splitValues) {
		Signal p = new Signal();
		SplitExecute s = new SplitExecute();
		s.splitValueList = splitValues;
		p.splitExecute = s;
		p.activityToken = activityToken;
		return p;
	}

	public static class SplitInquire extends Base {

	}

	public static Signal splitInquire(String activityToken) {
		Signal p = new Signal();
		SplitInquire s = new SplitInquire();
		p.splitInquire = s;
		p.activityToken = activityToken;
		return p;
	}

	public Signal() {
		this.time = new Date();
		this.stamp = this.time.getTime();
	}

	private String activityToken;

	public String getActivityToken() {
		return activityToken;
	}

	private Long stamp;

	public Long getStamp() {
		return stamp;
	}

	private Date time;

	public Date getTime() {
		return time;
	}

	public abstract static class Base {

	}

}