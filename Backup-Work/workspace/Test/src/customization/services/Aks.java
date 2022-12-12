package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Aks {
	
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
				
		ignoredWords.add("non-free subscription");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
	    
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		
		words.add(new String[] { "k8s.gcr.io", "k8sgcr.azk8s.cn" });
		words.add(new String[] { "mcr.microsoft.com", "mcr.azk8s.cn" });
		words.add(new String[] { "azurecr.io", "azurecr.cn" });
		words.add(new String[] { "azmk8s.io", "cx.prod.service.azk8s.cn" });
		
		
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {

	    warningWords.add("chinanorth222");
	    
	    warningWords.add("](](");
	    warningWords.add("billing");
	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");
//	    warningWords.add("chinaeast");
//	    warningWords.add("chinanorth");
	    warningWords.add("Containerizing applications through Azure Migrate");
	     warningWords.add("k8s.gcr.io");
	    warningWords.add("mcr.microsoft.com");
	    warningWords.add("azmk8s.io");
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
	
		uselessFiles.add("azure-ad-v2.md");
		uselessFiles.add("azure-netapp-files.md");
		uselessFiles.add("concepts-diagnostics.md");
		uselessFiles.add("deployment-center-launcher.md");
		uselessFiles.add("integrate-azure.md");
		uselessFiles.add("use-cosmosdb-osba-mongo-app.md");
		uselessFiles.add("use-pod-security-on-azure-policy.md");
		uselessFiles.add("use-ultra-disks.md");
		uselessFiles.add("view-master-logs.md");
		uselessFiles.add("virtual-kubelet.md");
		uselessFiles.add("windows-node-limitations.md");
		uselessFiles.add("use-pod-security-policies.md");
		uselessFiles.add("servicemesh-osm-about.md");
		uselessFiles.add("view-metrics.md");
		uselessFiles.add("quickstart-event-grid.md");
		uselessFiles.add("open-service-mesh-customize-add-on-experience.md");
		uselessFiles.add("open-service-mesh-ip-port-exclusion.md");
		uselessFiles.add("use-wasi-node-pools.md");
		uselessFiles.add("howto-deploy-java-liberty-app-with-postgresql.md");
		uselessFiles.add("gpu-multi-instance.md");
		uselessFiles.add("api-server-vnet-integration.md");
		uselessFiles.add("automated-deployments.md");
		uselessFiles.add("dapr-migration.md");
		uselessFiles.add("use-cvm.md");
		uselessFiles.add("azure-cni-overlay.md");
		uselessFiles.add("image-cleaner.md");
		uselessFiles.add("aks-planned-maintenance-weekly-releases.md");
		uselessFiles.add("dapr-troubleshooting.md");
		uselessFiles.add("deploy-marketplace.md");
		uselessFiles.add("managed-cluster-snapshot.md");
		uselessFiles.add("vertical-pod-autoscaler.md");
//		uselessFiles.add("workload-identity-deploy-cluster.md");
//		uselessFiles.add("workload-identity-migration-sidecar.md");
//		uselessFiles.add("workload-identity-overview.md");
		uselessFiles.add("aks-resource-health.md");
		uselessFiles.add("keda-troubleshoot.md");// Global delete on 2022-10-25


		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	// TODO scripts
	public static class learn {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String> ignoredWords = new ArrayList<String>();
		
		public synchronized static List<String> getIgnoredWords() {
			
			ignoredWords.add("non-free subscription");
			ignoredWords.add("");
			ignoredWords.add("");
			ignoredWords.add("");
		    
		    return ignoredWords;
		}
		
		public static synchronized List<String[]> getWords() {
			
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			
			return words;
		}
		
		public synchronized static List<String> getWarningWords() {

		    warningWords.add("chinanorth222");
		    
		    warningWords.add("](](");
		    warningWords.add("billing");
		    warningWords.add("]((");
		    warningWords.add("]http");
		    warningWords.add("]/");
		    
		    return warningWords;
		}
		
		public synchronized static List<String[]> getAttentionWords() {
			
			attentionWords.add(new String[]{"",           ""});
			attentionWords.add(new String[]{"",           ""});
			attentionWords.add(new String[]{"",           ""});
			
			return attentionWords;
		}
		
		public synchronized static List<String> getUselessFiles() {
		
			uselessFiles.add("tutorial-kubernetes-workload-identity.md");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}
	// TODO scripts
	public static class includes {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String> ignoredWords = new ArrayList<String>();
		
		public synchronized static List<String> getIgnoredWords() {
			
			ignoredWords.add("non-free subscription");
			ignoredWords.add("");
			ignoredWords.add("");
			ignoredWords.add("");
		    
		    return ignoredWords;
		}
		
		public static synchronized List<String[]> getWords() {
			
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			
			return words;
		}
		
		public synchronized static List<String> getWarningWords() {

		    warningWords.add("chinanorth222");
		    
		    warningWords.add("](](");
		    warningWords.add("billing");
		    warningWords.add("]((");
		    warningWords.add("]http");
		    warningWords.add("]/");
		    
		    return warningWords;
		}
		
		public synchronized static List<String[]> getAttentionWords() {
			
			attentionWords.add(new String[]{"",           ""});
			attentionWords.add(new String[]{"",           ""});
			attentionWords.add(new String[]{"",           ""});
			
			return attentionWords;
		}
		
		public synchronized static List<String> getUselessFiles() {
		
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	
		// TODO scripts
		public static class aliasminorversion {
			private static final List<String[]> words = new ArrayList<String[]>();
			private static final List<String> warningWords = new ArrayList<String>();
			private static final List<String[]> attentionWords = new ArrayList<String[]>();
			private static final List<String> uselessFiles = new ArrayList<String>();
			private static final List<String> ignoredWords = new ArrayList<String>();
			
			public synchronized static List<String> getIgnoredWords() {
				
				ignoredWords.add("non-free subscription");
				ignoredWords.add("");
				ignoredWords.add("");
				ignoredWords.add("");
				
				return ignoredWords;
			}
			
			public static synchronized List<String[]> getWords() {
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {
				
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
		}
		// TODO scripts
		public static class keda {
			private static final List<String[]> words = new ArrayList<String[]>();
			private static final List<String> warningWords = new ArrayList<String>();
			private static final List<String[]> attentionWords = new ArrayList<String[]>();
			private static final List<String> uselessFiles = new ArrayList<String>();
			private static final List<String> ignoredWords = new ArrayList<String>();
			
			public synchronized static List<String> getIgnoredWords() {
				
				ignoredWords.add("non-free subscription");
				ignoredWords.add("");
				ignoredWords.add("");
				ignoredWords.add("");
				
				return ignoredWords;
			}
			
			public static synchronized List<String[]> getWords() {
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {
				
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
		}
		// TODO scripts
		public static class preview {
			private static final List<String[]> words = new ArrayList<String[]>();
			private static final List<String> warningWords = new ArrayList<String>();
			private static final List<String[]> attentionWords = new ArrayList<String[]>();
			private static final List<String> uselessFiles = new ArrayList<String>();
			private static final List<String> ignoredWords = new ArrayList<String>();
			
			public synchronized static List<String> getIgnoredWords() {
				
				ignoredWords.add("non-free subscription");
				ignoredWords.add("");
				ignoredWords.add("");
				ignoredWords.add("");
				
				return ignoredWords;
			}
			
			public static synchronized List<String[]> getWords() {
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {
				
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
		}
		// TODO scripts
		public static class servicemesh {
			private static final List<String[]> words = new ArrayList<String[]>();
			private static final List<String> warningWords = new ArrayList<String>();
			private static final List<String[]> attentionWords = new ArrayList<String[]>();
			private static final List<String> uselessFiles = new ArrayList<String>();
			private static final List<String> ignoredWords = new ArrayList<String>();
			
			public synchronized static List<String> getIgnoredWords() {
				
				ignoredWords.add("non-free subscription");
				ignoredWords.add("");
				ignoredWords.add("");
				ignoredWords.add("");
				
				return ignoredWords;
			}
			
			public static synchronized List<String[]> getWords() {
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {
				
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
			// TODO scripts
			public static class consul {
				private static final List<String[]> words = new ArrayList<String[]>();
				private static final List<String> warningWords = new ArrayList<String>();
				private static final List<String[]> attentionWords = new ArrayList<String[]>();
				private static final List<String> uselessFiles = new ArrayList<String>();
				private static final List<String> ignoredWords = new ArrayList<String>();
				
				public synchronized static List<String> getIgnoredWords() {
					
					ignoredWords.add("non-free subscription");
					ignoredWords.add("");
					ignoredWords.add("");
					ignoredWords.add("");
					
					return ignoredWords;
				}
				
				public static synchronized List<String[]> getWords() {
					
					words.add(new String[] { "", "" });
					words.add(new String[] { "", "" });
					
					return words;
				}
				
				public synchronized static List<String> getWarningWords() {

					warningWords.add("chinanorth222");
					
					warningWords.add("](](");
					warningWords.add("billing");
					warningWords.add("]((");
					warningWords.add("]http");
					warningWords.add("]/");
					
					return warningWords;
				}
				
				public synchronized static List<String[]> getAttentionWords() {
					
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					
					return attentionWords;
				}
				
				public synchronized static List<String> getUselessFiles() {
				
					uselessFiles.add("");
					uselessFiles.add("");
					uselessFiles.add("");
					
					return uselessFiles;
				}
			}
			// TODO scripts
			public static class istio {
				private static final List<String[]> words = new ArrayList<String[]>();
				private static final List<String> warningWords = new ArrayList<String>();
				private static final List<String[]> attentionWords = new ArrayList<String[]>();
				private static final List<String> uselessFiles = new ArrayList<String>();
				private static final List<String> ignoredWords = new ArrayList<String>();
				
				public synchronized static List<String> getIgnoredWords() {
					
					ignoredWords.add("non-free subscription");
					ignoredWords.add("");
					ignoredWords.add("");
					ignoredWords.add("");
					
					return ignoredWords;
				}
				
				public static synchronized List<String[]> getWords() {
					
					words.add(new String[] { "", "" });
					words.add(new String[] { "", "" });
					
					return words;
				}
				
				public synchronized static List<String> getWarningWords() {

					warningWords.add("chinanorth222");
					
					warningWords.add("](](");
					warningWords.add("billing");
					warningWords.add("]((");
					warningWords.add("]http");
					warningWords.add("]/");
					
					return warningWords;
				}
				
				public synchronized static List<String[]> getAttentionWords() {
					
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					
					return attentionWords;
				}
				
				public synchronized static List<String> getUselessFiles() {
				
					uselessFiles.add("");
					uselessFiles.add("");
					uselessFiles.add("");
					
					return uselessFiles;
				}
			}
			// TODO scripts
			public static class linkerd {
				private static final List<String[]> words = new ArrayList<String[]>();
				private static final List<String> warningWords = new ArrayList<String>();
				private static final List<String[]> attentionWords = new ArrayList<String[]>();
				private static final List<String> uselessFiles = new ArrayList<String>();
				private static final List<String> ignoredWords = new ArrayList<String>();
				
				public synchronized static List<String> getIgnoredWords() {
					
					ignoredWords.add("non-free subscription");
					ignoredWords.add("");
					ignoredWords.add("");
					ignoredWords.add("");
					
					return ignoredWords;
				}
				
				public static synchronized List<String[]> getWords() {
					
					words.add(new String[] { "", "" });
					words.add(new String[] { "", "" });
					
					return words;
				}
				
				public synchronized static List<String> getWarningWords() {

					warningWords.add("chinanorth222");
					
					warningWords.add("](](");
					warningWords.add("billing");
					warningWords.add("]((");
					warningWords.add("]http");
					warningWords.add("]/");
					
					return warningWords;
				}
				
				public synchronized static List<String[]> getAttentionWords() {
					
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					
					return attentionWords;
				}
				
				public synchronized static List<String> getUselessFiles() {
				
					uselessFiles.add("");
					uselessFiles.add("");
					uselessFiles.add("");
					
					return uselessFiles;
				}
			}
			// TODO scripts
			public static class osm {
				private static final List<String[]> words = new ArrayList<String[]>();
				private static final List<String> warningWords = new ArrayList<String>();
				private static final List<String[]> attentionWords = new ArrayList<String[]>();
				private static final List<String> uselessFiles = new ArrayList<String>();
				private static final List<String> ignoredWords = new ArrayList<String>();
				
				public synchronized static List<String> getIgnoredWords() {
					
					ignoredWords.add("non-free subscription");
					ignoredWords.add("");
					ignoredWords.add("");
					ignoredWords.add("");
					
					return ignoredWords;
				}
				
				public static synchronized List<String[]> getWords() {
					
					words.add(new String[] { "", "" });
					words.add(new String[] { "", "" });
					
					return words;
				}
				
				public synchronized static List<String> getWarningWords() {

					warningWords.add("chinanorth222");
					
					warningWords.add("](](");
					warningWords.add("billing");
					warningWords.add("]((");
					warningWords.add("]http");
					warningWords.add("]/");
					
					return warningWords;
				}
				
				public synchronized static List<String[]> getAttentionWords() {
					
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					attentionWords.add(new String[]{"",           ""});
					
					return attentionWords;
				}
				
				public synchronized static List<String> getUselessFiles() {
				
					uselessFiles.add("install-osm-binary-linux.md");
					uselessFiles.add("install-osm-binary-macos.md");
					uselessFiles.add("install-osm-binary-windows.md");

					uselessFiles.add("");
					
					return uselessFiles;
				}
			}
		}
	}
}