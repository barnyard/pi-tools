// factory.createBlockingWriter().update(piIdBuilder.getApplicationIdForLocalScopeName("app:pi-ops-website", "REGION"), null, new UpdateResolver<ApplicationRecord>() { public ApplicationRecord update(ApplicationRecord existingEntity, ApplicationRecord requestedEntity) {existingEntity.getActiveNodeMap().clear();existingEntity.getActiveNodeMap().put("10.19.1.234/24", null);return existingEntity;}})